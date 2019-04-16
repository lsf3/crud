package com.sf.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.helloworld.bean.Department;
import com.sf.helloworld.service.DeptServiceJpa;

@RestController
public class DeptControllerJpa {
	@Autowired
	DeptServiceJpa jpaDeptService;
	
//  http://localhost:8080/deptJpa/1	
	@RequestMapping(value="/deptJpa/{id}")
	public Department selectDeptById(@PathVariable Integer id) {
		return jpaDeptService.selectDeptByIdJpa(id);
		
	}
//  http://localhost:8080/deleteDeptJpa/1
	@RequestMapping(value="/deleteDeptJpa/{id}")
	public Boolean deletetDeptById(@PathVariable Integer id) {
		return jpaDeptService.deleteDeptByIdJpa(id);
		
	}
	
	
	
//  http://localhost:8080/insertDeptJpa?departmentName=admin&dId=3
//  不加id或者加新的id就是增,加已有的id就是修改整条语句,想修改一部分属性就先查询在调对象的set方法
	@RequestMapping(value="/insertDeptJpa")
	public Department insertDepartment(Department department) 
	{
		
		return jpaDeptService.insertDeptJpa(department);
		
	}
	
	
	
//  http://localhost:8080/updatDeptJ?id=1&departmentName=admin&dId=3		
	@GetMapping(value="/updatDeptJ")
	public Boolean updateDepartment1(Department department) 
	{
		
		 Boolean boolean1 = jpaDeptService.updateDeptJpa(department.getId(),department.getDepartmentName(),department.getdId());
		 
		return boolean1;
		
	}
	
//  http://localhost:8080/updatDeptJ222?id=1&departmentName=admin&dId=3		
	@GetMapping(value="/updatDeptJ222")
	public Integer updateDepartment222(Department department) 
	{
		
		Integer updateDeptJpa222 = jpaDeptService.updateDeptJpa222(department.getId(),department.getDepartmentName(),department.getdId());
		
		return updateDeptJpa222;
		
	}
	

	
	
	
//  http://localhost:8080/selectDeptJpa/开/3
	@GetMapping(value="/selectDeptJpa/{departmentName}/{dId}")//用@RequestMapping会报错!!!!!!!!!!!
	public List<Department> selectDepartment(@PathVariable("departmentName")String departmentName,
			                                 @PathVariable("dId")Integer dId) {
		List<Department> selectDept = jpaDeptService.selectDept(departmentName, dId);
		
		return selectDept;
		
	}
	
//  http://localhost:8080/selectByDIdRang/2/4
	@GetMapping(value="/selectByDIdRang/{dId1}/{dId2}")//用@RequestMapping会报错!!!!!!!!!!!
	public List<Department> selectByDIdRangJpa(@PathVariable("dId1")Integer dId1,
			@PathVariable("dId2")Integer dId2) {
		List<Department> selectDept = jpaDeptService.selectByDIdRang(dId1, dId2);
		
		return selectDept;
		
	}
	
	
	
	
	
	

}
