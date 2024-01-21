package com.bridgelabz.user;
import java.util.Scanner;


public class UserRegistration {
	/*
	 * @desc:Main function that handles all the calls
	 * 
	 * @params:none
	 * 
	 * @return:none
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("User please enter your first name:- ");
		String firstName = scanner.nextLine();

		FirstName isValidFirstName = (s) -> {
			if (s.matches("^[A-Z][a-zA-Z]{2,}$")) {
				System.out.println("Valid first name");
			} else {
				System.out.println("Invalid first name");
			}
		};
		isValidFirstName.checkFirstName(firstName);

		System.out.println("User please enter your last name:- ");
		String lastName = scanner.nextLine();
		LastName isValidLastName = (s) -> {
			if ((s).matches("^[A-Z][a-zA-Z]{2,}$")) {
				System.out.println("Valid last name");
			} else {
				System.out.println("Invalid last name");
			}
		};
		isValidLastName.checkLastName(lastName);

		System.out.println("User please enter your phone number :- ");
		String phoneNumber = scanner.nextLine();
		PhoneNumber isValidPhoneNumber = (s) -> {
			if (s.matches("^[+]\\d{1,3} \\d{10}$")) {
				System.out.println("Valid phone number");
			} else {
				System.out.println("Invalid phone number");
			}
		};
		isValidPhoneNumber.checkPhoneNumber(phoneNumber);

		System.out.println("User please enter the password:- ");
		String password = scanner.nextLine();
		Password isValidPassword = (s) -> {
			if (s.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$")) {
				System.out.println("Valid password");
			} else {
				System.out.println("Invalid password");
			}
		};
		isValidPassword.checkPassword(password);
		
		System.out.println("User please enter your email:- ");
		String email = scanner.nextLine();

		Email isValidEmail = (s) -> {
			if (s.matches("^[a-zA-z0-9]{1,}[\\.+-]?[a-zA-z0-9]+@[a-zA-z0-9]{1,}(\\.[a-zA-z]{2,}){1,2}$")) {
				System.out.println("Valid email");
			} else {
				System.out.println("Invalid email");
			}
		};
		isValidEmail.checkEmail(email);
	}
}

