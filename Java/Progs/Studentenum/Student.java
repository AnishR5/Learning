//1:create student class with rollno,name,address,email,Course course(create ENUM course)

package Student;

public class Student {
	
	private int rollno;
	private String name,city,email;
	private Courses c;
	
	public Student()
	{
		rollno=111;
		name="abc";
		city="xyz";
		email="abc@company.com";
	}
	
	public Student(int rollno,String name,String city,String email,Courses c)
	{
		this.rollno=rollno;
		this.name=name;
		this.city=city;
		this.email=email;
		this.c=c;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRollno() {
		return rollno;
	}
	
	@Override
	public String toString()
	{
		return "Rollno: "+this.rollno+" Name:"+this.name+" City:"+this.city+" email:"+this.email+" Coursename:"+this.c;
	}

	public String getName() {
		return name;
	}

}
