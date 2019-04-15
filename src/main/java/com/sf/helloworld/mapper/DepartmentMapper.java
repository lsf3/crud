package com.sf.helloworld.mapper;

import org.apache.ibatis.annotations.*;

import com.sf.helloworld.bean.Department;

/**
 * @author SF
 * @create 2019-03-18 15:17
 */
//@Mapper
public interface DepartmentMapper {
 
    @Select("select * from department where id=#{id}")
    public Department getDeptBId(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName,dId) values(#{departmentName},#{dId})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName},dId=#{dId} where id=#{id}")
    public  int updateDept(Department department);


}
