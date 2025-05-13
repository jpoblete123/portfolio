/*
Author: Jeremiah Poblete
Class: IS-2063
03/24/2024
*/


// This program will validate a given password to ensure it meets the criteria.

import javax.swing.*; //allows for the use of GUI input and output

public class challenge09_jeremiah_poblete { //main class

    public static void main(String[] args){ //main method

        String input; // variable that stores the user input as a string


        input = JOptionPane.showInputDialog(null,
                "Hello, welcome to Amazon! Please create a password: "); // prompts for user input

        // declares boolean variables that will all be set to false
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isDigit= false;
        boolean specialCharacter = false;

        // places input into a character array and iterates through it using a for loop
        // if validated the class is set to true
        for (char i : input.toCharArray()){
            if (Character.isLowerCase(i)){ // validates for a lower case letter
                isUpperCase = true;
            }else if (Character.isUpperCase(i)){ //validates for an upper case letter
                isLowerCase = true;
            }else if (Character.isDigit(i)){ // validates for a digit
                isDigit = true;
            }else if ("!@#$%^&*".indexOf(i) != -1){ // indexes each letter in the character array to the special characters
                specialCharacter = true;
            }
        }

        // if else statement that determines if the password if valid or invalid.
        if (input.length() >= 8 && isLowerCase && isUpperCase && isDigit && specialCharacter){
            JOptionPane.showMessageDialog(null, "Password is Valid");
        }else{
            JOptionPane.showMessageDialog(null, "Password is Invalid");
        }
    }
}
