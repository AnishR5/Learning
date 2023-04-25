//2:create array of students
//3:Menu  1:add student  2: edit address  3: display
//Note:case 1:add Student
// if student is duplicate then dont add in array.
//identity:rollno and cname
//101 vaishali pune DAC
//102 rahul pune DBDA
//101 ajay nagar DAC--->
package Tester;
import com.enume.*;
import Student.Courses;
import java.util.Scanner;
import Student.Student;

public class testStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Courses[] courselist=Courses.values();
		System.out.println("Course list");
		for(Courses i:courselist)
		{
			System.out.println(i);
		}
		Student[] s=new Student[5];
		int index=0;
		int ch;
		System.out.println("Menu\n1.Add Student\n2.Edit City\n3.Display Students");
		
		do {
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			if(index<s.length)
			{
			if(index==0)
			{
			System.out.println("Enter student rollno,name,city,email,Coursename");
			s[index]=new Student(sc.nextInt(), sc.next(), sc.next(), sc.next(), Courses.valueOf(sc.next().toUpperCase()));
			index++;
			System.out.println("Student created");
			}
			else 
			{
				System.out.println("Enter name and rollno");
				int rkey=sc.nextInt();
				String nkey=sc.next();
				for(Student i:s)
				{
					if(i.getName()!=nkey && i.getRollno()!=rkey)
					{
						System.out.println("Enter student city,email,Coursename");
						s[index++]=new Student(rkey, nkey, sc.next(), sc.next(), Courses.valueOf(sc.next().toUpperCase()));
						System.out.println("Student created");
					}
					else
					{
						System.out.println("Duplicate name or rollno ");
					}
				}
			}

			}
			else
			{
				System.out.println("Array full");
			}
		}break;
		case 2:
		{
			System.out.println("Enter rollno ");
			int key=sc.nextInt();
			for(Student i:s)
			{
				if(i!=null)
				{
				if(i.getRollno()==key)
				{
					System.out.println("Enter updated city");
					i.setCity(sc.next());
					System.out.println("City updated to "+i.getCity());
				}
				}
			}
		}break;
		case 3:
		{
			for(Student i:s)
			{
				if(i!=null)
				{
					System.out.println(i);
				}
			}
		}break;
		
		}//switch end
		}while(ch!=4);
		
	}//main end

}
