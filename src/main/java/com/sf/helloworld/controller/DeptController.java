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
	@RequestMapping(value="/dept/{id}")
	public Department selectDeptById(@PathVariable Integer id) {
		return DeptService.selectDeptById(id);
		
	}
//  http://localhost:8080/deleteDept/1
	@RequestMapping(value="/deleteDept/{id}")
	public int deletetDeptById(@PathVariable Integer id) {
		return DeptService.deleteDeptById(id);
		
	}
//  http://localhost:8080/insertDept/xxx部/1
	@RequestMapping(value="/insertDept/{departmentName}/{dId}")
	public int insertDepartment(@PathVariable("departmentName") String departmentName,
			                           @PathVariable("dId") Integer dId) 
	{
		
		return DeptService.insertDept(departmentName, dId);
		
	}
//  http://localhost:8080/updatDept/1/xxx部/1		
	@RequestMapping(value="/updatDept/{id}/{departmentName}/{dId}")
	public int updateDepartment(@PathVariable("id") Integer id,
								@PathVariable("departmentName") String departmentName,
								@PathVariable("dId") Integer dId) 
	{
		
		return DeptService.updateDept(id, departmentName, dId);
		
	}
	
	

}