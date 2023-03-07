package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "ascompany.com";

	public Email(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

		this.department = setDepartment();
		//System.out.println("Department: " + this.department);

		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is: " + email);
	}

	public String setDepartment() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Hey new worker! " + "Which Department? : ");
		String departmentChoice = scanner.nextLine().toLowerCase();

		return departmentChoice;

	}

	private String randomPassword(int length) {

		String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXYZ0123456789!@#$%";

		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);
	}

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;

	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String showInfo() {
		return "firstName: " + firstName + "\nlastName: " + lastName + "\nemail: " + email + "\nmailboxCapacity: "
				+ mailboxCapacity + " mb ";
	}

	
}
