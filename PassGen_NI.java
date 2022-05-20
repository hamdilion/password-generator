//Written by Naail Iqbal 10/12/2021

//Import Scanner class
import java.util.Scanner;

public class PassGen_NI {
	public static void main(String[] args) {
		//Create variable for Scanner
		Scanner user_input = new Scanner(System.in);

		//Ask user for first name, last name, and date of birth
		System.out.print("Enter First Name: ");
		String fName = user_input.next();
		System.out.print("Enter Last Name: ");
		String lName = user_input.next();
		System.out.print("Enter DOB (DD-MMM-YY): ");
		String dob = user_input.next();

		System.out.print("\n");

		//Print user first name, last name, and DOB
		System.out.println("First Name: " + fName);
		System.out.println("Last Name:  " + lName);
		System.out.println("DOB:        " + dob);

		System.out.print("\n");

		//Use substring method to reverse birth day
		String reverseBD = dob.substring(1,2) + dob.substring(0,1);
		//Store first two letters of first name in f2 variable
		String f2 = fName.substring(0,2);
		//Store length of last name in length variable
		int length = lName.length();
		//Use length to store last two letters of last name in l2 variable
		String l2 = lName.substring(length-2, length);
		//Use substring to reverse birth month and birth year
		String reverseBM = dob.substring(5,6) + dob.substring(4,5) + dob.substring(3,4);
		String reverseBY = dob.substring(8) + dob.substring(7,8);

		//Construct password
		String password = reverseBD + f2 + l2 + "&" + reverseBM + reverseBY;
		//Print password
		System.out.println("Your password is: " + password);

		System.out.print("\n");

		/*Ask user to enter password and perform password verification by using
		equals method to see if the passwords match or not*/ 
		System.out.println("Password Verification ...");

		System.out.print("\n");

		System.out.print("Enter password: ");
		String passAttempt = user_input.next();
		System.out.println("Passwords match: " + passAttempt.equals(password));

	}
}