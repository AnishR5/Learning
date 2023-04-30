package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
//import static java.time.LocalDate.now;
//import static java.time.LocalTime;
public class D1 {

	public static void main(String[] args) {
		
//		Date d1=new Date();
//		System.out.println(d1);
		Date d=new Date();
		LocalDate d2=LocalDate.now();             //now is static method
		System.out.println(d2);
		System.out.println("----------------------");
		
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		System.out.println("----------------------");
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		System.out.println("------------------------");
		
		LocalDate d3=LocalDate.of(2023, 8, 23);        //enter custom date another way parse
		System.out.println(d3);
		System.out.println();
	}

}
