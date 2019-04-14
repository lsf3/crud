package com.sf.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sf.helloworld.bean.Department;
import com.sf.helloworld.mapper.DepartmentMapper;

@Component
public class DeptService {
	
	@Autowired
	DepartmentMapper departmentMapper;
	

	public Department selectDeptById(Integer id) {
		Department deptBId = departmentMapper.getDeptBId(id);
		return deptBId;
	}
	public int deleteDeptById(Integer id) {
		return departmentMapper.deleteDeptById(id);
		
	}
	
	public int insertDept(String departmentName,Integer dId) {
		Department department = new Department();
		department.setDepartmentName(departmentName);
		department.setdId(dId);
		return departmentMapper.insertDept(department);
	}
	public int updateDept(Integer id,String departmentName,Integer dId) {
		Department department = new Department();
		department.setId(dId);
		department.setDepartmentName(departmentName);
		department.setdId(dId);
		return departmentMapper.updateDept(department);
	}
	
	
	

}
