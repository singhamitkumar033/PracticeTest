package com.ProgrammsImp;

public class Student implements Comparable<Student> {
	int rollNo;
	String name;
	String address;

	public Student() {
		super();
	}

	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Student student) {
		/*
		 * if (this.getName().equals(student.getName())) return 0; else
		 */
		return this.getName().compareTo(student.getName());
	}
}
