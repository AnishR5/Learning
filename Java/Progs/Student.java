//7:Create Student class with rollno,name address.
//Write business logic for auto incrment of rollno(don't accept roll no from user)
//Write parameterised constr for accepting name and address only
//Write getter and setter and display function
//7.1 Test Student class by creating  5 diff object.and display aal details(chk rollno created automatically)
//7.2 Create an array of 5 students and show only names 
//7:Create diff package and add class inside that.
//Try to access one package class in another package....
package BlAssignment3;

public class Student {
	private int rollno;
	private String name, address;
	private static int rollcounter, total;

	static {
		rollcounter = 1000;
		total = 0;
	}

	public Student(String name, String address) {
		rollcounter++;
		total++;
		this.name = name;
		this.address = address;
		this.rollno = rollcounter;
	}

	public void displayDetails() {
		System.out.println("Name: " + name + " Roll number: " + rollno + " Address:" + address);
	}

	public static int getTotal() {
		return total;
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

	public String toString() {
		return "Name: " + name + " Roll number: " + rollno + " Address:" + address;
	}

	public int getRollno() {
		return rollno;
	}

}
