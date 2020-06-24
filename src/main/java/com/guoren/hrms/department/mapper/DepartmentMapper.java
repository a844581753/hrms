package com.guoren.hrms.department.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.guoren.hrms.department.entity.Department;

@Mapper
@Component
public interface DepartmentMapper {
	// 根据父id查询子类部门(组织架构图使用)
	List<Department> queryDepartmentByDeptParentId(Integer deptParentId);

	// 查询所有部门(组织架构图使用)
	List<Department> queryAllDepartment();

	// 查询除了一级部门以外的部门(组织架构图使用)
	List<Department> selectAllNotBase();

	// 查询所有部门带分页带条件
	List<Department> queryAllDepartments(Department department);

	// 添加部门
	Integer addDepartment(Department department);

	// 根据编号修改部门信息
	Integer updateDepartmentBydeptId(Department department);
}
