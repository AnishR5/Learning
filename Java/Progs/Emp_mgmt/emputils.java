package Emp_mgmt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static Emp_mgmt.validationrules.validateall;
import static Emp_mgmt.validationrules.validateempno;
public class emputils {
	
//	public static List<Employee> populateemplist() throws EmployeeException
//	{
//		ArrayList<Employee> emps=new ArrayList<Employee>();
//		emps.add(validateall("abc-1001", "Kenil", "Versoya", "SALES", "2022-05-21", 50000, emps));
//		emps.add(validateall("abc-1002", "Abhay", "Aigal", "FINANCE", "2022-05-21", 50000, emps));
//		emps.add(validateall("abc-1003", "Janbhai", "Tomar", "RND", "2022-05-21", 50000, emps));
//		emps.add(validateall("abc-1004", "Bhavesh", "Chaudhary", "PRODUCTION", "2022-05-21", 50000, emps));
//		emps.add(validateall("abc-1005", "Kapil", "Kanke", "HR", "2022-05-21", 50000, emps));
//		return emps;
//	}
	
	public static HashMap<String, Employee> populateMap() throws EmployeeException
	{
		HashMap<String, Employee> emps= new HashMap<String, Employee>();
		emps.put(validateempno("abc-1001", emps),validateall("abc-1001", "Kenil", "Versoya", "SALES", "2022-05-21", 50000, emps));
		emps.put(validateempno("abc-1002", emps),validateall("abc-1002", "Abhay", "Aigal", "FINANCE", "2022-05-21", 50000, emps));
		emps.put(validateempno("abc-1003", emps),validateall("abc-1003", "Janbhai", "Tomar", "RND", "2022-05-21", 50000, emps));
		emps.put(validateempno("abc-1004", emps),validateall("abc-1004", "Bhavesh", "Chaudhary", "PRODUCTION", "2022-05-21", 50000, emps));
		emps.put(validateempno("abc-1005", emps),validateall("abc-1005", "Kapil", "Kanke", "HR", "2022-05-21", 50000, emps));
		return emps;
	}
	
}
