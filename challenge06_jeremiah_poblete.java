/*
Author: Jeremiah Poblete
Class: IS-2063
02/25/2024
*/


// This program will calculate an area, diameter, and circumference using radius. It will then draw the circle.
import javax.swing.*; // allows for the use of GUI programming
import java.awt.*; // allows for the use of drawings
import java.awt.geom.Ellipse2D; // allows for the drawing of 2d models
import java.io.IOException; // handles IOExceptions

public class challenge06_jeremiah_poblete {

    public static void main(String[] args) throws IOException{
        Menu.displayMenu(); // calls the display menu method under the class Menu
    }
}
class Menu { // Menu class the hold the displayMenu method
    public static void displayMenu(){ // method that will prompt for input and display output

        // gathers input from user and storing it as a double.
        double input = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Please enter the radius for the circle: "));
        Circle circle1 = new Circle(); // creating a circle object and assigning it
        circle1.setRadius(input); // sets the radius and stores it within the class

        //output of the Circle class
        JOptionPane.showMessageDialog(null, "The circles radius is " + circle1.getRadius());
        JOptionPane.showMessageDialog(null, "The circles area is " + circle1.area());
        JOptionPane.showMessageDialog(null, "The circles diameter is " + circle1.diameter());
        JOptionPane.showMessageDialog(null, "The circles circumference is " + circle1.circumference());

        JFrame frame = new JFrame(); // creates a new object
        frame.setSize(400,400); // size of the frame
        frame.add(circle1); // adds the object circle1 panel to the frame
        frame.setVisible(true); // makes the JFrame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sets the close operation
    }

}
 class Circle extends JPanel  { // Circle class that will hold attributes and methods pertaining to the circle
    private double radius; // variable that will be stored in object memory
    private final double PI = 3.14159; // variable that is constant and will not change stored in object memory

    public Circle() { // constructor that is used when creating an object of this class
        this.radius = 0.0;
    }

    public void setRadius(double radius) { // setter method used to set the value of the field
        this.radius = radius;
    }

    public double getRadius(){ // getter method used to store the radius and will return a value if called
        return radius;
    }

    public double area(){ // stores and calculates the area of the circle
        return PI * radius * radius;
    }

    public double diameter(){ // stores and calculates the diameter
        return radius * 2;
    }

    public double circumference(){ // stores and calculates the circumference
        return 2 * PI * radius;
    }

    // used to help create the circle https://www.youtube.com/watch?v=0MqWS9nkN9E
    public void paintComponent(Graphics g) { // paint method
         super.paintComponent(g); // clears are for the JPanel
         Graphics2D g2d = (Graphics2D) g; //object that is created of the Graphics2D class

         int diameter = (int) (diameter()); // takes the double diameter and casts it as an integer
         int x = (getWidth() - diameter) / 2; // calculates the x coordinate
         int y = (getHeight() - diameter) / 2; // calculates the y coordinate

         Ellipse2D.Double circle = new Ellipse2D.Double(x, y, diameter, diameter); // creates an ellipse2D object representing the circle
         g2d.draw(circle); // draws the circle into Graphics2D and will output it on the JPanel
     }
}