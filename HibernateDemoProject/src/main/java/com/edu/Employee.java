package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  //create table Student
public class Student {
	@Id   //primary key
private int Eid;
private String Ename;
private Float Esalary;
//generate setter and getter method 
//generate toString
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ",esalary="
		+ esalary"]";
}


}
