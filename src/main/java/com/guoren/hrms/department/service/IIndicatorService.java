package com.guoren.hrms.department.service;

import com.github.pagehelper.PageInfo;
import com.guoren.hrms.department.entity.Department;
import com.guoren.hrms.department.entity.Indicator;

public interface IIndicatorService {
	// 根据部门编号查找科室指标使用信息带分页
	PageInfo<Indicator> queryIndicatorByBelongToDeptId(Indicator indicator);
	
	// 添加科室指标使用信息
	Integer addIndicator(Indicator indicator);
}
