package com.sf.helloworld.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity//告诉jpa这是一个实体类,和数据表映射的类;
@Table(name="department")//指定具体与哪一个数据表映射,如果与类名小写相同可以省略name值
public class Department implements Serializable {
	@Id//标注主键
	@GeneratedValue(strategy=GenerationType.IDENTITY)//自增主键
    private Integer id;
	@Column(name="department_name",length=50)//最好别偷懒,不然它会强制驼峰转换并创建新列...
    private String departmentName;
	@Column(name="d_id",length=10)//不同就不能省略
    private Integer dId;


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", dId=" + dId +
                '}';
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
