import java.util.Scanner;

// A class which Validates a password based on certain 

// Needs to have at least one digit
// Needs to have at least one upper case letter
// Needs to have at least one lower case letter 
// length of password should be at least 6
// Needs to have at least one special character (%, $, #, @, !)

public class ValidatePassword {
	public static void main(String[] args) {
		validPassword();
	}

	public static boolean validPassword () {
	int upperCaseCount = 0;
	int lowerCaseCount = 0;
	int digitCount = 0;
	int specialCharacterCount = 0;
	Boolean flag = false;
	String input = "";
	System.out.println("Password needs to have at least one digit");
	System.out.println("Password needs to have at least one upper case letter");
	System.out.println("Password needs to have at least one lower case letter ");
	System.out.println("Password needs to have at least one digit");
	System.out.println("length of password should be at least 6");
	System.out.println("Password needs to have at least one special character (%, $, #, @, !)");
	System.out.println();
	System.out.println();
	while (flag != true) {
	System.out.println("Enter a vald password based on the above mentioned specifications");
	
	Scanner scnr = new Scanner(System.in);
	input = scnr.nextLine();
	int length = input.length();
	
	if(length < 6) {
		System.out.println("The password is invalid. Ensure you have a password with atleast 6 characters");
	}
	
	upperCaseCount = 0;
	lowerCaseCount = 0;
	digitCount = 0;
	specialCharacterCount = 0;
	
	for (int i = 0; i < length; i++) {
		char c = input.charAt(i);
		
		if (Character.isUpperCase(c)) {
			upperCaseCount++;
		}
		
		if (Character.isLowerCase(c)) {
			lowerCaseCount++;
		}
		
		if (Character.isDigit(c)) {
			digitCount++;
		}
		
		if (c == '$' || c == '#' || c == '%' || c == '!' || c == '@') {
			specialCharacterCount++;
		}
	}

	if (upperCaseCount < 1) {
		System.out.println("Invalid password. Add more uppercase characters");
	}
	
	if (lowerCaseCount < 1) {
		System.out.println("Invalid password. Add more lowercase characters");
	}
	
	if (digitCount < 1) {
		System.out.println("Invalid password. Add more digits");
	}
	
	if (specialCharacterCount < 1) {
		System.out.println("Invalid password. Add more special characters");
	}
	
	if (length >= 6 && upperCaseCount >= 1 && lowerCaseCount >= 1 && digitCount >= 1 && specialCharacterCount >= 1) {
		System.out.println("The password has been successfully validated");
		flag = true;
	}
	}
	
	// Correct password must have been obtained at this stage
	// Confirm password
	Boolean flag2 = false;
	while (flag2 != true) {
	System.out.println("Enter the same password again to confirm it");
	Scanner scnr = new Scanner (System.in);
	String confirmPassword = scnr.nextLine();
	if (input.equals(confirmPassword)) {
		System.out.println("The password has been set");
		flag2 = true;
		//break;
	}
	
	else {
		System.out.println("The password has not been set. Confirm the password");
	}
	}
	return true;
	}
}
