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
import com.guoren.hrms.department.service.IDepartmentService;
import com.guoren.hrms.instrument.R;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	IDepartmentService departmentServiceImpl;

	// 查询所有部门返回树形结构做组织架构图
	@RequestMapping(value = "/getDepartmentTree", method = RequestMethod.GET)
	public List<Department> getDepartmentTree() {
		List<Department> departmentBase = departmentServiceImpl.queryDepartmentByDeptParentId(0);
		List<Department> departmentLNotBase = departmentServiceImpl.selectAllNotBase();
		for (Department department : departmentBase) {
			List<Department> departments = iterateDepartments(departmentLNotBase, department.getDeptId());
			department.setDepartmentChildren(departments);
		}
		return departmentBase;
	}

	public List<Department> iterateDepartments(List<Department> departmentVoList, Integer deptParentId) {
		List<Department> result = new ArrayList<Department>();
		for (Department department : departmentVoList) {
			// 获取菜单的id
			Integer departmentDeptId = department.getDeptId();
			// 获取菜单的父id
			Integer parentid = department.getDeptParentId();
			if (parentid != null) {
				if (parentid.equals(deptParentId)) {
					// 递归查询当前子菜单的子菜单
					List<Department> iterateDepartment = iterateDepartments(departmentVoList, departmentDeptId);
					department.setDepartmentChildren(iterateDepartment);
					result.add(department);
				}
			}
		}
		return result;
	}

	// 查询所有部门带分页带条件
	@ResponseBody
	@RequestMapping(value = "/queryAllDepartments", method = RequestMethod.POST)
	public PageInfo<Department> queryAllDepartments(Department department) {
		PageInfo<Department> queryResult = departmentServiceImpl.findAllUserByPageS(department);
		return queryResult;
	}

	// 添加部门
	@RequestMapping(value = "/addDepartment", method = RequestMethod.POST)
	public R addDepartment(Department department) {
		department.setDeptState(1);
		Integer count = departmentServiceImpl.addDepartment(department);
		if (count == 1) {
			return R.ok().put("isOk", count);
		} else {
			return R.ok().put("isNo", count);
		}

	}

	// 根据编号修改部门信息
	@RequestMapping(value = "/updateDepartmentBydeptId", method = RequestMethod.POST)
	public R updateDepartmentBydeptId(Department department) {
		Integer count = departmentServiceImpl.updateDepartmentBydeptId(department);
		if (count == 1) {
			return R.ok().put("isOk", count);
		} else {
			return R.ok().put("isNo", count);
		}
	}
}
