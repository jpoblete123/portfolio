/*
Author: Jeremiah Poblete
Class: IS-2063
03/11/2024
*/


// This program will gather length and width of two tracts and compare them to see if they are equal.
import javax.swing.JOptionPane; // allows the use of GUI input and output

public class challenge08_jeremiah_poblete { // main class

    public static void main(String[] args){ // main method

        // variable declaration used to store input
        int length1;
        int length2;
        int width1;
        int width2;

        // prompts for user input for the first tract
        JOptionPane.showMessageDialog(null, "Please enter the dimensions of the First Tract");
        length1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the first tract: "));
        width1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the first tract: "));

        Tract land1 = new Tract(length1, width1); // creates the first tract object
        JOptionPane.showMessageDialog(null, land1.toString()); // outputs the toString method

        // prompts for user input for the second tract
        JOptionPane.showMessageDialog(null, "Please enter the dimensions of the Second Tract");
        length2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of the second tract: "));
        width2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the width of the second tract: "));

        Tract land2 = new Tract(length2, width2);// creates the second tract object
        JOptionPane.showMessageDialog(null, land2.toString());

        JOptionPane.showMessageDialog(null, "The Area of Tract 1 =  " + land1.area() +
                "\nThe Area of Tract 2 =  " + land2.area()); // outputs the area of both tracts

        // if else statement that calls the equals method, that will determine if they are equal or not
        if (land1.equals(land2)) {
            JOptionPane.showMessageDialog(null, "Tracts are an equal size! ");
        }else{
            JOptionPane.showMessageDialog(null, "Tracts are not an equal size.");
        }
    }
}
class Tract { // creates the tract class

    // private fields to store length and width of the tract
    private int length;
    private int width;

    public Tract(int length, int width){ // constructor for length and width
        this.length = length;
        this.width = width;
    }

    public int area() { // method that calculates the area and returns it
        return length * width;
    }

    public boolean equals(Tract other) { // method to check if the two tracks are equal
        return this.area() == other.area();
    }


    public String toString() { // returns a string of the tracts length, width and area
        return "Length: " + length + "\nWidth: " + width + "\nArea: " + area();
    }
}