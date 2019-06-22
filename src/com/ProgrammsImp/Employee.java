package com.ProgrammsImp;

public class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	Double empSalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public Employee(int empId, String empName, Double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Employee o) {
		/*
		 * if(this.getEmpId()==o.getEmpId()) { return 0; } else if(this.getEmpId()>
		 * o.getEmpId()) { return 1; } else return -1;
		 */
		int result = this.getEmpName().compareTo(o.getEmpName());
		if (result == 0) {
			if (this.getEmpId() == o.getEmpId())
				return 0;
			else if (this.getEmpId() < o.getEmpId())
				return 1;
			else
				return -1;
		}
		return result;
	}

}
