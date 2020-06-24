package com.guoren.hrms.department.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.guoren.hrms.department.entity.Department;

public interface IDepartmentService {
	// 根据父id查询子类部门(组织架构图使用)
	List<Department> queryDepartmentByDeptParentId(Integer deptParentId);

	// 查询所有部门(组织架构图使用)
	List<Department> queryAllDepartment();

	// 查询除了一级部门以外的部门(组织架构图使用)
	List<Department> selectAllNotBase();

	// 查询所有部门带分页带条件
	PageInfo<Department> findAllUserByPageS(Department department);

	// 添加部门
	Integer addDepartment(Department department);

	// 根据编号修改部门信息
	Integer updateDepartmentBydeptId(Department department);

}
