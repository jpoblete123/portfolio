/*
Author: Jeremiah Poblete
Class: IS-2063
05/06/2024
*/



// This Program will take a string and output the string reversed.

import javax.swing.*; // allows for the use of GUI based programming

public class finalExam {

    public static void main(String[] args) {

        // gathers user input
        String userInput = JOptionPane.showInputDialog(null, "Please enter word: ");

        // calls the method to reverse the string
        String reversed = reverse(userInput);

        // outputs the reversed string
        JOptionPane.showMessageDialog(null, "Your word reversed: " + reversed);
    }

    public static String reverse(String word){ // method to reverse string
        StringBuilder reverseWord = new StringBuilder(); // creates an object to store the word
        // for loop that will iterate through each character and input it in reverse
        for (int i = word.length() - 1; i >=0; i--) {
            reverseWord.append(word.charAt(i)); // appends the character to the object
        }
        return reverseWord.toString(); // returns the object as a string to be called
    }
}