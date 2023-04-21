// Create a class Person with data members as name, age, city. Write getters
// and setters for all the data members. Also add the display function. Create
// Default and Parameterized constructors. Create the object of this class in
// main method and invoke all the methods in that class. 
package BlAssignment3;

public class Person {
	private String name,city;
	private int age;
	private static int id;
	
	static {
		id=0;
	}
	
	
	public Person()
	{
		id++;
		name="abc";
		age=99;
		city="Delhi";
		
	}
	
	public Person(String name,int age,String city)
	{
		
		this.name=name;
		this.age=age;
		this.city=city;
		id++;
	}
	
	public void displayDetails()
	{
		System.out.println("Name: "+name+" Age: "+age+" City: "+city+"Total persons"+id);
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
