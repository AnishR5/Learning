package Emp_mgmt;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface validationrules {
//empid,parsedate,parseenum	
	
	
	public static Employee validateall(String empid, String fname, String lname, String dept, String joindate, double salary,Map<String, Employee> emps) throws EmployeeException
	{
		validateempno(empid,emps);
		LocalDate vdate=validateDOJ(joindate);
		Dept vdept= validateDept(dept);
		return new Employee(empid, fname, lname, vdept, vdate, salary);
		
	}
	
	public static String validateempno(String empn,Map<String, Employee> emps) throws EmployeeException
	{	
		if(emps.containsKey(empn))
			throw new EmployeeException("Duplicate empid");
		return empn;
		
//		emps.values()
//		.forEach(e->e.getEmpid().equals(empn));
	}
	
	public static LocalDate validateDOJ(String DOJ) throws EmployeeException
	{
		LocalDate valid=LocalDate.parse(DOJ);
		if(valid.isBefore(LocalDate.now().minusYears(3)))
		{
			return valid;
		}
		throw new EmployeeException("Not a valid Joindate ");
		
	}
	
	public static Dept validateDept(String dept)
	{
		return Dept.valueOf(dept.toUpperCase());
	}
	
	
	
	

}
