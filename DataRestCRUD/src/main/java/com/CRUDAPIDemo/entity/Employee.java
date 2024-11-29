package com.CRUDAPIDemo.entity;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Employee")
public class Employee {
	

	@Id
	private int empID;
	private String empName;
	private String empEmail;
	private String empAdress;
	private String empDepartment;
	
	Employee()
	{
		
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpAdress() {
		return empAdress;
	}
	public void setEmpAdress(String empAdress) {
		this.empAdress = empAdress;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public Employee(int empID, String empName, String empEmail, String empAdress, String empDepartment) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empAdress = empAdress;
		this.empDepartment = empDepartment;
	}
	
	
	
	
	
	
	
	
	
	
	

//	@Id
//	@Column
//	private int empid;
//
//	@Column
//	private String empName;
//
//	@Column
//	private String empLocation;
//
//	@Column
//	private long empsal;
//
//	@Column
//	private String EmpDesignation;
//
//	public Employee() {
//
//	}
//
//	public Employee(int empid, String empName, String empLocation, long empsal, String empDesignation) {
//
//		this.empid = empid;
//		this.empName = empName;
//		this.empLocation = empLocation;
//		this.empsal = empsal;
//		EmpDesignation = empDesignation;
//	}
//
//	public int getEmpid() {
//		return empid;
//	}
//
//	public void setEmpid(int empid) {
//		this.empid = empid;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public String getEmpLocation() {
//		return empLocation;
//	}
//
//	public void setEmpLocation(String empLocation) {
//		this.empLocation = empLocation;
//	}
//
//	public long getEmpsal() {
//		return empsal;
//	}
//
//	public void setEmpsal(long empsal) {
//		this.empsal = empsal;
//	}
//
//	public String getEmpDesignation() {
//		return EmpDesignation;
//	}
//
//	public void setEmpDesignation(String empDesignation) {
//		EmpDesignation = empDesignation;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [empid=" + empid + ", empName=" + empName + ", empLocation=" + empLocation + ", empsal="
//				+ empsal + ", EmpDesignation=" + EmpDesignation + "]";
//	}

}
