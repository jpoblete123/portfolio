/*
Author: Jeremiah Poblete
Class: IS-2063
05/05/2024
*/


// This program will calculate an area of a polygon using classes, methods, inheritance, decision structures and looping structures

import javax.swing.*; // allows for the use of jOptionPane for input and output

public class jeremiah_poblete_Lab01 {

    public static void main(String[] args){ // main method that will call the user interface
        userInterface(); // method call for userInterface
    }

    public static void userInterface(){ // user interface that will handle all user input
        JOptionPane.showMessageDialog(null, "Welcome to my Polygon Area Calculator");

        // do while that will allow user to input as many shapes as they want
        do {
            // holds the points and sides to determine the shape
            int sides;
            int points;

            do { // do while loop that ensures input is a proper polygon

                // user input that will hold how many sides and points the shape has
                sides = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of sides: "));
                points = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of points: "));

                if (sides != points){ // determines if sides and points are equal
                    JOptionPane.showMessageDialog(null, "Sides and Points must be Equal");
                }

            }while (sides != points); // will loop if sides and points are not equal

            // ensures that the polygon is a closed shape
            int closed = JOptionPane.showConfirmDialog(null, "Is the shape closed: ", "Shape", JOptionPane.YES_NO_OPTION);
            boolean isClosed = (closed == JOptionPane.YES_OPTION);

            // creates a polygon object after input is validated
            Polygons polygons = new Polygons(sides, points, isClosed);
            String shape = polygons.determineShape(); //calls the method in polygons ot determine the shape of the polygon

            // if and else if that will process if one of the requirements are met for the shape
            if(shape.equals("Quadrilateral")){
                // checks to see if the sides are equal in order to determine if the shape is a square or rectangle
                String equalSides = JOptionPane.showInputDialog(null, "Are the sides equal Yes or No: ");
                equalSides = equalSides.toLowerCase();

                if (equalSides.equals("yes")){ // if sides are equal
                    double sideLength = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Length of a side: "));
                    // creates a square object and takes in the length given in order to find the area
                    Square square = new Square(sideLength);
                    // outputs the area of the square
                    JOptionPane.showMessageDialog(null, "The area of the square is: " + square.getArea());

                }else if (equalSides.equals("no")){ // if sides are not equal it is a rectangle
                    // user input for length and width
                    double length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Length: "));
                    double width = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Width: "));
                    // creates a rectangle object and takes in the length and width
                    Rectangle rectangle = new Rectangle(length, width);
                    // outputs the area of the rectangle
                    JOptionPane.showMessageDialog(null, "The area of the Rectangle is: " + rectangle.getArea());

                }else { // in case user does not answer yes or no
                    JOptionPane.showMessageDialog(null, "Invalid: Must choose yes or no");
                }

            }else if (shape.equals("Triangle")){ // else if that will run if 3 sides and 3 points
                // will determine the type of triangle in order to create the correct object
                int triangle = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Enter 1: Equilateral \nEnter 2: Isosceles \nEnter 3: Scalene\n"));

                // else if statement that is based on the type of triangle
                if (triangle == 1){
                    // user input that gathers the length of the side
                    double sideLength = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the Length of a side: "));
                    // creates equilateral triangle object and takes in the side length
                    EquilateralTriangle equilateralTriangle = new EquilateralTriangle(sideLength);
                    // outputs the area of the triangle
                    JOptionPane.showMessageDialog(null, "The area of the Equilateral Triangle is: " + equilateralTriangle.getArea());

                }else if(triangle == 2){
                    // user input that gathers the base and height of triangle
                    double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the Base: "));
                    double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the Height: "));
                    // creates isosceles triangle object and intakes base and height
                    IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(base, height);
                    // outputs the area of the triangle
                    JOptionPane.showMessageDialog(null, "The area of the Isosceles Triangle is: " + isoscelesTriangle.getArea());

                }else if (triangle == 3){
                    // user input that gathers the base and height of triangle
                    double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the Base: "));
                    double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the Height: "));
                    // creates scalene triangle object and intakes base and height
                    ScaleneTriangle scaleneTriangle = new ScaleneTriangle(base, height);
                    // outputs the area of the triangle
                    JOptionPane.showMessageDialog(null, "The area of the Scalene Triangle is: " + scaleneTriangle.getArea());
                }
            }
            //while that will allow users to get area of other objects
        }while (JOptionPane.showConfirmDialog(null, "Would you like to find the area of another shape?", "Try again",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }
}

class Polygons{ // polygons super class that will hold the number of sides, number of points and if the shape is closed
    int numOfSides;
    int numOfPoints;
    boolean isClosed;

    public Polygons(int numOfSides, int numOfPoints, boolean isClosed){ // constructor
        this.numOfSides = numOfSides;
        this.numOfPoints = numOfPoints;
        this.isClosed = isClosed;
    }

    public String determineShape(){ // method that will determine the shape
        if (numOfSides == 3 && numOfPoints == 3 && isClosed){
            return "Triangle";
        }else if (numOfSides == 4 && numOfPoints == 4 && isClosed){
            return "Quadrilateral";
        }else{
            return "Unknown";
        }
    }
}

class Rectangle extends Polygons{ // subclass of polygons that has 4 sides and 4 points and will gather the length and width
    private double length;
    private double width;

    public Rectangle(double length, double width){ // constructor for rectangle class
        super(4,4,true);
        this.length = length;
        this.width = width;
    }

    // method that will get the area of rectangle
    public double getArea(){
        return length * width;
    }
}

class Square extends Rectangle{ // subclass that will inherit properties of rectangle such as 4 sides and 4 points
    public Square(double sideLength){ //constructor and will inherit the getArea from rectangle
        super(sideLength,sideLength); //sets the sideLength to length and width and will find area
    }
}

// triangle classes that will inherit from the Polygons class 3 sides and 3 points
class EquilateralTriangle extends Polygons{
    private double side;

    public EquilateralTriangle(double side) { // constructor gathers one side of triangle
        super(3, 3, true);
        this.side = side;
    }

    public double getArea(){ // calculates the area when called
        return(Math.sqrt(3) / 4) * side * side;
    }
}
class IsoscelesTriangle extends Polygons{
    private double base;
    private double height;


    public IsoscelesTriangle(double base, double height) { // constructor gathers base and height of triangle
        super (3,3,true);
        this.base = base;
        this.height = height;
    }

    public double getArea(){ // calculates the area of triangle
        return(base * height) / 2;
    }
}

class ScaleneTriangle extends Polygons{
    private double base;
    private double height;

    public ScaleneTriangle(double base, double height) { // constructor gathers base and height of triangle
        super(3, 3, true);
        this.base = base;
        this.height = height;
    }

    public double getArea() { // calculates the area of triangle
        return (base * height) / 2;
    }
}

