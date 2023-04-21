package Tester;

import java.util.Scanner;

import BlAssignment3.Student;

public class Teststudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] s = new Student[5];
		// System.out.println(s1);
		int index = 0;
		boolean b = false;
		int choice = 0;
		do {
			System.out.println("Menu:\n1.Create Account\n2.Get details\n3.Update\n4.Get names\n5.Exit\nEnter choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {

				System.out.println("Enter Name and City");
				s[index] = new Student(sc.next(), sc.next());

				System.out.println(
						"Account created!! Roll no:" + s[index].getRollno() + "Total students: " + s[index].getTotal());
				index++;

				break;
			}
			case 2: {
				System.out.println("Enter Roll number:");
				int key = sc.nextInt();
				for (int i = 0; i < index; i++) {
					if (s[i].getRollno() == key) {
						b = true;
						s[i].displayDetails();
					}
				}
				if (b == false) {
					System.out.println("Account not found!!!");
				}
			}
				break;

			case 3: {
				System.out.println("Enter Roll number:");
				int key = sc.nextInt();
				for (int i = 0; i < index; i++) {
					if (s[i].getRollno() == key) {
						b = true;
						System.out.println("1.Name\n2.Address");
						int temp = sc.nextInt();
						switch (temp) {
						case 1: {
							System.out.println("Enter Updated name ");
							s[i].setName(sc.nextLine());
							System.out.println("updated name :" + s[i].getName());
							break;
						}

						case 2: {
							System.out.println("Enter Updated Address ");
							s[i].setAddress(sc.next());
							System.out.println("updated name :" + s[i].getAddress());
							break;
						}
						}
					}
					if (b == false) {
						System.out.println("Roll number not found!!");
					}
				}
				break;
			}
			case 4: {
				System.out.println("Names are: ");
				for (int i = 0; i < index; i++) {
					System.out.println(s[i].getName());

				}
			}
				break;
			case 5: {
				System.out.println("Exiting Application!!!!");
				break;
			}
			default: {
				System.out.println("Invalid Option");
			}
			}
		} while (choice != 5);
	}

}
