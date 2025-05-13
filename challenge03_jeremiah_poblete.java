/*
Author: Jeremiah Poblete
Class: IS-2063
02/01/2024
*/


// This program will determine if user typed an uppercase character or lowercase character



import javax.swing.JOptionPane; //Import allows the use of JOptionPane

public class challenge03_jeremiah_poblete {

    public static void main(String[] args){

        String input; //String variable that is declared in order to receive user input

        input = JOptionPane.showInputDialog("Please enter a character "); //Popout that prompts user input


        //Nested if statements that will determine the output of user input

        if (input.length() == 1){ //Only allows for input of a single letter

            char letter = input.charAt(0); //Converts the String into a single character


            if (Character.isUpperCase(letter))

                JOptionPane.showMessageDialog(null, "Your letter is uppercase!");


            else if (Character.isLowerCase(letter))

                JOptionPane.showMessageDialog(null, "Your letter is lowercase!");


            else
                JOptionPane.showMessageDialog(null, "I cannot determine the case of a value " +

                        "other than an alphabetical character.");

        }
        else //Else statement that will execute if user enters multiple characters
            JOptionPane.showMessageDialog(null, "Please only enter a single character.");

    }

}
