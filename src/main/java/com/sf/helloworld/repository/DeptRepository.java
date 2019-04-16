package com.sf.helloworld.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sf.helloworld.bean.Department;


//继承JpaRepository 来完成对数据库的操作
//还可以用注解标识接口!
//@RepositoryDefinition(domainClass=Department.class,idClass=Integer.class)
public interface DeptRepository extends JpaRepository<Department, Integer> {
	
	
	List<Department> getByDepartmentNameStartingWithAndDIdGreaterThan(String departmentName,Integer dId);
	
	List<Department> getByDIdBetween(Integer dId1,Integer dId2);
	
	Department  getById(Integer id);
	
	
	@Modifying
	@Query("update Department d SET d.departmentName = :departmentName , d.dId= :dId  WHERE d.id = :id ")
	int updateDeptUseJpql(@Param("id")Integer id,@Param("departmentName")String departmentName,@Param("dId")Integer dId);
}
