package com.sf.helloworld.mapper;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sf.helloworld.bean.Employee;

/**
 * @author SF
 * @create 2019-03-18 16:51
 */
@Mapper
public interface EmployeeMapper {
	@Select("select * from employee where id = #{id}")
    public Employee getEmpById(Integer id);
	@Update("update employee set lastName =#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
    public int updateEmpById(Employee employee);
	
	@Options(useGeneratedKeys=true,keyProperty="id")
	@Insert("insert into employee(lastName, gender,email, d_id) values(#{lastName},#{gender},#{email},#{dId} )")
    public  int  insertEmp(Employee employee);
	
	@Delete("delete from employee where id=#{id}")
    public int deleteEmp (Integer id);

}
