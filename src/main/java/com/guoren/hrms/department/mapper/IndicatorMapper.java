package com.guoren.hrms.department.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.guoren.hrms.department.entity.Department;
import com.guoren.hrms.department.entity.Indicator;

@Mapper
@Component
public interface IndicatorMapper {
	// 根据部门编号查找科室指标使用信息带分页
	List<Indicator> queryIndicatorByBelongToDeptId(Indicator indicator);

	// 添加科室指标使用信息
	Integer addIndicator(Indicator indicator);
}
