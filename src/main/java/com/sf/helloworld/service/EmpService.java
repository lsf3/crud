package com.sf.helloworld.service;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sf.helloworld.bean.Employee;
import com.sf.helloworld.mapper.EmployeeMapper;

@Component
public class EmpService {
	@Autowired
	EmployeeMapper employeeMapper;
	
	public Employee selectEmpById( Integer id) {
		return employeeMapper.getEmpById(id);
	}
	/*
	public int updateEmpById( Integer id,String lastName,Integer gender,
			                 String email, Integer dId) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setLastName(lastName);
		employee.setGender(gender);
		employee.setEmail(email);
		employee.setdId(dId);
		
		return employeeMapper.updateEmpById(employee);
	}
	*/
	
	public int updateEmpById(Employee employee) {
		return employeeMapper.updateEmpById(employee);
	}
	
	
	
	
	
	
	/*
	public int insertEmp(String lastName,Integer gender,
			                 String email, Integer dId) {
		Employee employee = new Employee();
		employee.setLastName(lastName);
		employee.setGender(gender);
		employee.setEmail(email);
		employee.setdId(dId);
		
		return employeeMapper.insertEmp(employee);
		
	}
	*/
	
	public int insertEmp(Employee employee) {
		return employeeMapper.insertEmp(employee);
		
	}
	
	
	
	
	
	
	
	public int deleteEmpById(Integer id) {
		return  employeeMapper.deleteEmp(id);
	}
	

}
