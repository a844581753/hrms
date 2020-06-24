package com.guoren.hrms.department.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.guoren.hrms.department.entity.Department;
import com.guoren.hrms.department.entity.Indicator;
import com.guoren.hrms.department.service.IDepartmentService;
import com.guoren.hrms.department.service.IIndicatorService;
import com.guoren.hrms.instrument.R;

@RestController
@RequestMapping("/indicator")
public class IndicatorController {
	@Autowired
	IIndicatorService IndicatorServiceImpl;

	// 根据部门编号查找科室指标使用信息带分页
	@ResponseBody
	@RequestMapping(value = "/queryIndicatorByBelongToDeptId", method = RequestMethod.POST)
	public PageInfo<Indicator> queryIndicatorByBelongToDeptId(Indicator indicator) {
		PageInfo<Indicator> queryResult = IndicatorServiceImpl.queryIndicatorByBelongToDeptId(indicator);
		return queryResult;
	}

	// 添加科室指标使用信息
	@RequestMapping(value = "/addIndicator", method = RequestMethod.POST)
	public R addIndicator(Indicator indicator) {
		indicator.setState(1);
		Integer count = IndicatorServiceImpl.addIndicator(indicator);
		if (count == 1) {
			return R.ok().put("isOk", count);
		} else {
			return R.ok().put("isNo", count);
		}

	}

}
