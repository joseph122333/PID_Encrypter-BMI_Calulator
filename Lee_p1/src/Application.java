// This program is to either Encrypt or Decrypt your code.


import java.util.Scanner;


public class Application {
	
	// Main Function to Prompt user input
	public static void main(String[] args) {
		
	System.out.printf("To Encrypt press 1 or for Decryption press 2:\n");
	
	Scanner userInput = new Scanner(System.in);
	
	int answer = userInput.nextInt();
	//  Encrypt
	if( answer == 1)
	{
		System.out.printf("You have chosen to Encrypt!\nPlease type in your 4 number code below:\n");
		int code = userInput.nextInt();
		Encrypt.main(code);
	}
	// Decrypt
	else if( answer == 2) 
	{
		System.out.printf("You have chosen Decrypt!\nPlease type in your 4 number code below:");
		int code = userInput.nextInt();
		Decrypter.main(code);
	}
	// All other answers
	else 
	{
		System.out.println("That is not a valid option choose again.");
	}


}
	}
