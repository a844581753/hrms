package com.guoren.hrms.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guoren.hrms.department.entity.Department;
import com.guoren.hrms.department.mapper.DepartmentMapper;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;

	// 根据父id查询子类部门(组织架构图使用)
	@Override
	public List<Department> queryDepartmentByDeptParentId(Integer deptParentId) {

		return departmentMapper.queryDepartmentByDeptParentId(deptParentId);
	}

	// 查询所有部门(组织架构图使用)
	@Override
	public List<Department> queryAllDepartment() {

		return departmentMapper.queryAllDepartment();
	}

	// 查询除了一级部门以外的部门(组织架构图使用)
	@Override
	public List<Department> selectAllNotBase() {

		return departmentMapper.selectAllNotBase();
	}

	// 查询所有部门带分页带条件
	@Override
	public PageInfo<Department> findAllUserByPageS(Department department) {
		PageHelper.startPage(department.getPageNum(), department.getPageSize());
		List<Department> lists = departmentMapper.queryAllDepartments(department);
		PageInfo<Department> pageInfo = new PageInfo<Department>(lists);
		return pageInfo;
	}

	// 添加部门
	@Override
	public Integer addDepartment(Department department) {
		return departmentMapper.addDepartment(department);
	}

	// 根据编号修改部门信息
	@Override
	public Integer updateDepartmentBydeptId(Department department) {
		return departmentMapper.updateDepartmentBydeptId(department);
	}

}
