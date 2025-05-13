/*
Author: Jeremiah Poblete
Class: IS-2063
02/07/2024
*/


// This program will read a file and determine the number of occurrences of a specified character

import javax.swing.JOptionPane; //allows for the use of JOptionPane GUI
import java.io.FileReader; //allows the use of file reader
import java.io.IOException; // IO exception will catch any errors with input and output
import java.util.Scanner; //allows for the use of the file scanner

public class challenge04_jeremiah_poblete {

public static void main(String[] args) throws IOException {

    String file, letter; //string declaration

    //prompts user for input
    file = JOptionPane.showInputDialog("Please enter your file path: ");
    letter = JOptionPane.showInputDialog("Please enter a character: ");

    FileReader fileReader = new FileReader(file); //reads the file that user inputted
    Scanner fileScanner = new Scanner(fileReader); //scans the file that is being read
    int count = 0; //count is used to determine the number of occurrences

    while (fileScanner.hasNextLine()){ //while loop that iterates through each line of text
        String line = fileScanner.nextLine(); //reads the next line of text from the file
        for (int i = 0; i < line.length(); i++){ //for loop that will check for a specified character in each line
            if (line.charAt(i) == letter.charAt(0)) { //if statement will determine if specified character is scanned
                count++; //increments everytime a specified character is read
            }
        }
    }
    JOptionPane.showMessageDialog(null, "The character " + letter + " is repeated "
    + count + " times in the file.");
    }
}
