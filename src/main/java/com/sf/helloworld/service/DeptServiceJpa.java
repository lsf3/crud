package com.sf.helloworld.service;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sf.helloworld.bean.Department;
import com.sf.helloworld.repository.DeptRepository;

@Component
public class DeptServiceJpa {
	@Autowired
	DeptRepository deptRepository;
	

	public Department selectDeptByIdJpa(Integer id) {
		Department deptBId = deptRepository.findOne(id);
		return deptBId;
	}
	public boolean deleteDeptByIdJpa(Integer id) {
		 deptRepository.delete(id);
		
		 return true;
	}
	
	public Department insertDeptJpa(Department department) {
		 department=deptRepository.save(department);
		
		 return department;
	}
	
	
	
	@Transactional
	public boolean updateDeptJpa(Integer id,String departmentName,Integer dId) {
		Department byId = deptRepository.getById(id);
		byId.setDepartmentName(departmentName);
		byId.setdId(dId);
		
		 
		 return true;
	}
	
	@Transactional
	public Integer updateDeptJpa222(Integer id,String departmentName,Integer dId) {
		 Integer updateDeptUseJpql = deptRepository.updateDeptUseJpql(id, departmentName, dId);
		
		
		
		return updateDeptUseJpql;
	}
	
	
	
	
	
	
	
	
	
	public List<Department> selectDept(String departmentName,Integer dId) {
		List<Department> deptList = deptRepository.getByDepartmentNameStartingWithAndDIdGreaterThan(departmentName, dId);
		return deptList;
		
	}
	

	public List<Department> selectByDIdRang(Integer dId1,Integer dId2) {
		List<Department> list =deptRepository.getByDIdBetween(dId1, dId2);
		
		
		
		return list;
		
	}
	
	
	

}
