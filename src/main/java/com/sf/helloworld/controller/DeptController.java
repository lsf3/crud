package com.sf.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.helloworld.bean.Department;
import com.sf.helloworld.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	DeptService DeptService;
	
//  http://localhost:8080/dept/1	
	@GetMapping(value="/dept/{id}")
	public Department selectDeptById(@PathVariable Integer id) {
		return DeptService.selectDeptById(id);
		
	}
//  http://localhost:8080/deleteDept/1
	@GetMapping(value="/deleteDept/{id}")
	public int deletetDeptById(@PathVariable Integer id) {
		return DeptService.deleteDeptById(id);
		
	}
	
	/*
//  http://localhost:8080/insertDept/xxx部/1
	@GetMapping(value="/insertDept/{departmentName}/{dId}")
	public int insertDepartment(@PathVariable("departmentName") String departmentName,
			                           @PathVariable("dId") Integer dId) 
	{
		
		return DeptService.insertDept(departmentName, dId);
		
	}
	*/
	
//  http://localhost:8080/insertDept?departmentName=admin&dId=3
	@GetMapping(value="/insertDept")
	public int insertDepartment(Department department) 
	{
		
		return DeptService.insertDept(department);
		
	}
	
	/*
//  http://localhost:8080/updatDept/1/xxx部/1		
	@GetMapping(value="/updatDept/{id}/{departmentName}/{dId}")
	public int updateDepartment(@PathVariable("id") Integer id,
								@PathVariable("departmentName") String departmentName,
								@PathVariable("dId") Integer dId) 
	{
		
		return DeptService.updateDept(id, departmentName, dId);
		
	}
	*/
	
//  http://localhost:8080/updatDept?id=1&departmentName=admin&dId=3		
	@GetMapping(value="/updatDept")
	public int updateDepartment1(Department department) 
	{
		
		return DeptService.updateDept(department);
		
	}
	
	

}
