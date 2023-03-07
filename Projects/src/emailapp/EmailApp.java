package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		
		// Generate an email --> firstname.lastname@department.company.com
		// Determine the department
		// Generate a random String for a password
		// Have set methods to change the password,
		// set the mailbox capacity,
		// define an alternate email address
		// Have get methods to display the name, email and mailbox capacity
		
		Email email = new Email("John", "Smith");
//		email.setAlternateEmail("js@gmail.com");
//		System.out.println(email.getAlternateEmail());
		System.out.println(email.showInfo());
		

	}

}
