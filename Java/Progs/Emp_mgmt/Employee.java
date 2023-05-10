package Emp_mgmt;

import java.time.LocalDate;

public class Employee {
	
	private String empid;
	private String fname;
	private String lname;
	private Dept dept;
	private LocalDate joindate;
	private double salary;
	
	public Employee(String empid, String fname, String lname, Dept dept, LocalDate joindate, double salary) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.dept = dept;
		this.joindate = joindate;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + ", lname=" + lname + ", dept=" + dept + ", joindate="
				+ joindate + ", salary=" + salary + "]";
	}

	public String getEmpid() {
		return empid;
	}
	
	public LocalDate getDoj()
	{
		return joindate;
	}
	

}
