package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask the user how many new students will be added to the database
		// The user should be prompted to enter the name and year for each student
		// The student should have a 5-digit unique ID, with the first number being their grade level
		// A student can enroll in the following courses:
		/* History 101
		 * Mathematics 101
		 * English 101
		 * Chemistry 101
		 * Computer Science 101
		 */
		// Each course costs $600 to enroll
		// The student should be able to view their balance and pay the tuition
		// To see the status of the student, we should see their name, ID, courses enrolled and balance
		
		System.out.println("Enter number of new students to enroll: ");
		Scanner scanner = new Scanner(System.in);
		int numOfStudent = scanner.nextInt();
		Student[] students = new Student[numOfStudent];
		
		for(int n = 0;  n < numOfStudent; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
		
		
	}

}
