package com.kenny.springboot.entities;

import java.io.Serializable;

/**
* @description: 雇主信息
* @param
* @return
* @throws
* @author Kenny
* @date 2020/12/2 13:50
*/
public class Department implements Serializable {

	private static final long serialVersionUID = 3735732054805317385L;
	private Integer id;
	private String departmentName;

	public Department() {
	}
	
	public Department(int i, String string) {
		this.id = i;
		this.departmentName = string;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
}
