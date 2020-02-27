package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email email = new Email("Nivesh", "Mavuduru");
		email.setAlternateEmail("niv.mav@gmail.com");
		System.out.println(email.showInfo());
	}

}
