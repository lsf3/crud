package com.sf.helloworld.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

import com.sf.helloworld.bean.Department;


//继承JpaRepository 来完成对数据库的操作
//还可以用注解标识接口!
//@RepositoryDefinition(domainClass=Department.class,idClass=Integer.class)
public interface DeptRepository extends JpaRepository<Department, Integer> {
	
	
	List<Department> getByDepartmentNameStartingWithAndDIdGreaterThan(String departmentName,Integer dId);
	
	List<Department> getByDIdBetween(Integer dId1,Integer dId2);
	
	
}
