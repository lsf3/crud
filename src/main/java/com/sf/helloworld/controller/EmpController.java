package com.sf.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.helloworld.bean.Employee;
import com.sf.helloworld.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService empService;
	
//  http://localhost:8080/emp/1
	@RequestMapping(value="/emp/{id}")
	public Employee selectEmpById(@PathVariable Integer id) {
		return empService.selectEmpById(id);
	}
	/*
//   http://localhost:8080/updateEmp/1/admin/1/admin@qq.com/3
	@RequestMapping(value="updateEmp/{id}/{lastName}/{gender}/{email}/{dId}")
	public int updateEmpById( @PathVariable("id") Integer id,
		                      @PathVariable("lastName") String lastName,
		                      @PathVariable("gender") Integer gender,
		                      @PathVariable("email") String email,
		                      @PathVariable("dId") Integer dId)
	{
		return empService.updateEmpById(id,lastName, gender,email, dId);
	}
	*/
	
//   http://localhost:8080/updateEmp?id=1&lastName=admin&gender=1&email=admin@qq.com&dId=3
	@RequestMapping(value="/updateEmp")
	public int updateEmpById(Employee employee)
	{
		return empService.updateEmpById(employee);
	}
	
	/*
//  http://localhost:8080/insertEmp/admin/1/admin@qq.com/3
	@RequestMapping(value="/insertEmp/{lastName}/{gender}/{email}/{dId}")
	public int insertEmpById(
							@PathVariable("lastName") String lastName,
							@PathVariable("gender") Integer gender,
							@PathVariable("email") String email,
							@PathVariable("dId") Integer dId) {
		return empService.insertEmp(lastName, gender, email, dId);
	}*/
	
//  http://localhost:8080/insertEmp?lastName=admin&gender=1&email=admin@qq.com&dId=3
	@RequestMapping(value="/insertEmp")
	public int insertEmpById(Employee employee) {
		return empService.insertEmp(employee);
	}
	
//  http://localhost:8080/deleteEmp/1
	@RequestMapping(value="/deleteEmp/{id}")
	public int deleteEmpById(@PathVariable Integer id) {
		return empService.deleteEmpById(id);
	}


}
