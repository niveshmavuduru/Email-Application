package emailapp;
import java.util.*;

public class Email 
{
	private String firstName;
	private String lastName;
	private String password;
	private int passwordLength;
	private String department;
	private int mailboxCapacity = 500;
	private String email;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	public Email(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
		// call a method that asks for department and returns a string.
		department = setDepartment();
		// call a method that can be used to generate a random password.
		passwordLength = 10;
		password= randomPassword(passwordLength);
		System.out.println(firstName + " " + lastName + " " + department + "  " + password);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
	}
	// Ask for department
	private String setDepartment()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Department Codes:\n1. Sales\n2. Developement\n3. Accounting\n0. None\nEnter the code : ");
		int deptChoice = scan.nextInt();
		if(deptChoice == 1){ return "Sales"; }
		else if(deptChoice==2) {return "Development";}
		else if(deptChoice == 3){return "Accounting";}
		else{return "";}
	}
	
	// Generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$abcdefghijklmnopqrstuvwxyz";
		char[] password = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}
	
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		mailboxCapacity = capacity;
	}
	
	// set the alternate email
	public void setAlternateEmail(String alt)
	{
		alternateEmail = alt;
	}
	
	//change the password
	public void changePassword(String pass)
	{
		password = pass;
	}
	
	public int getMailboxCapacity()
	{
		return mailboxCapacity;
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String showInfo()
	{
		System.out.println("*********************************************");
		return "Display Name : " + firstName + " " + lastName + 
				"\nCompany Email : " + email + 
				"\nMailbox Capacity : " + mailboxCapacity + " MB"+
				"\nAlternate Email : " + alternateEmail;
	}
}

