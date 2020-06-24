package com.guoren.hrms.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guoren.hrms.department.entity.Department;
import com.guoren.hrms.department.entity.Indicator;
import com.guoren.hrms.department.mapper.DepartmentMapper;
import com.guoren.hrms.department.mapper.IndicatorMapper;

@Service
public class IndicatorServiceImpl implements IIndicatorService {

	@Autowired
	IndicatorMapper indicatorMapper;

	// 根据部门编号查找科室指标使用信息带分页
	@Override
	public PageInfo<Indicator> queryIndicatorByBelongToDeptId(Indicator indicator) {
		PageHelper.startPage(indicator.getPageNum(), indicator.getPageSize());
		List<Indicator> lists = indicatorMapper.queryIndicatorByBelongToDeptId(indicator);
		PageInfo<Indicator> pageInfo = new PageInfo<Indicator>(lists);
		return pageInfo;
	}

	// 添加科室指标使用信息
	@Override
	public Integer addIndicator(Indicator indicator) {
		// TODO Auto-generated method stub
		return indicatorMapper.addIndicator(indicator);
	}

}
