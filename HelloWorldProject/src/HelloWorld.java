/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
 * TODO: Program Description
 */

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueProgram = true;
        
        System.out.println("Welcome!  You have the following options:");
        
        while (continueProgram) {
            System.out.println("1. Binary to Decimal");
            System.out.println("2. Decimal to Binary");
            
            int choice;
            while (true) {
                System.out.print("Which type of conversion would you like to perform?  ");
                choice = input.nextInt();
                
                if (choice == 1 || choice == 2) {
                    break;
                }
            } // end input validation loop
            
            if (choice == 1) {
                System.out.print("What is the binary number? ");
                String binaryString = input.next();
                int decimal = Integer.parseInt(binaryString, 2);
                System.out.println("The decimal equivalent is: " + decimal);
            } else if (choice == 2) {
                System.out.print("What is the decimal number? ");
                int decimal = input.nextInt();
                String binaryString = Integer.toBinaryString(decimal);
                String eightBitBinary = String.format("%8s", binaryString).replace(' ', '0');
                System.out.println("The binary equivalent is: " + eightBitBinary);
            } // end conversion logic
            
            System.out.print("Do you want to continue - yes or no?  ");
            String response = input.next().toLowerCase();
            
            continueProgram = response.equals("yes");
            
            if (continueProgram) {
                System.out.println("You have the following options:");
            } // end continue check
        } // end main program loop
        
        input.close();
    } // end main method
}
