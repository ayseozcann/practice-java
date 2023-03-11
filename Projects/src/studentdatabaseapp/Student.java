package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = scanner.nextLine();

		System.out.print("Enter student last name: ");
		this.lastName = scanner.nextLine();

		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = scanner.nextInt();

		setStudentID();
	}

	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}

	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;

			} else {
				break;
			}
		} while (1 != 0);
	}

	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	public void payTuition() {
		viewBalance();
		System.out.println("Enter your paymnet: $");
		Scanner scanner = new Scanner(System.in);
		int payment = scanner.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}

	@Override
	public String toString() {
		return "firstName: " + firstName + "\nlastName: " + lastName + "\ngradeYear: " + gradeYear
				+ "\nstudentID: " + studentID + "\ncourses: " + courses + "\ntuitionBalance: " + tuitionBalance;
	}


}
