package com.ltts.Spring;

public class Student {
private int studentID;
private String studentname;
private String studentaddress;
public int getStudentID() {
	return studentID;
}
public void setStudentID(int studentID) {
	this.studentID = studentID;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentaddress() {
	return studentaddress;
}
public void setStudentaddress(String studentaddress) {
	this.studentaddress = studentaddress;
}

@Override
public String toString() {
	return "Student [studentID=" + studentID + ", studentname=" + studentname + ", studentaddress=" + studentaddress
			+ "]";
}


}
