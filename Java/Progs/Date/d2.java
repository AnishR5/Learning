package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class d2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date yyyy-mm-dd");
		LocalDate d1=LocalDate.parse(sc.next());       //parse static method,enter custom date,runtimeexception not Checked type(SimpleDateFormat)
		System.out.println("D1:"+d1);
		System.out.println();
		
		LocalDate today=LocalDate.now();
		System.out.println(d1.isAfter(today));
		System.out.println(d1.isBefore(today));
		System.out.println(d1.equals(today));
		System.out.println(d1.compareTo(today));       //return -ve,0,or +ve value 
		
		System.out.println("Enter date dd-mm-yyyy	`");
		LocalDate d2=LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(d2);
//		System.out.println("Enter date yyyy-mm-dd");
//		LocalDate d2=LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
//		System.out.println("D2:"+d2);

	}

}
