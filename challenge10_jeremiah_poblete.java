/*
Author: Jeremiah Poblete
Class: IS-2063
03/31/2024
*/

/* This program will use inheritance to gather employee information of a production worker and will use object to gather
and output information*/

import javax.swing.*; // allows for GUI based input and output
public class challenge10_jeremiah_poblete { //main class

    public static void main(String[] args){ //main method

        //creates an object of production workers
        ProductionWorker employee = new ProductionWorker("0", "0", "0", 0, 0 );

        //prompts for user input collecting string variables
        String name = JOptionPane.showInputDialog(null, "Enter Employee Name:");

        boolean validEmployeeNumber; //boolean that will be used to validate employee number format
        String employeeNumber;
        do { //do while loop that will keep looping if format is not correct
            employeeNumber = JOptionPane.showInputDialog(null, "Enter Employee Number:");
            validEmployeeNumber = employeeNumber.matches("[0-9][0-9][0-9]-[A-M]");

            if (!validEmployeeNumber){ //if statement that will output an invalid message
                JOptionPane.showMessageDialog(null, "Invalid employee number." +
                        "\n Please use XXX-[A-M] format.");
            }
        }while (!validEmployeeNumber);

        String hireDate = JOptionPane.showInputDialog(null, "Enter hire date of Employee:");

        //collect the variables for shift and hourly pay rat
        int shift = Integer.parseInt(JOptionPane.showInputDialog(null, "Indicate what " +
                "shift the employee is working\n" + "Enter 1: Day shift \nEnter 2: Night Shift"));
        double hourlyPayRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter" +
                " Employees hourly rate:"));

        //use the setters in order to store the values in the production worker object
        employee.setName(name);
        employee.setEmployeeNumber(employeeNumber);
        employee.setHireDate(hireDate);
        employee.setShift(shift);
        employee.setHourlyPayRate(hourlyPayRate);


        //outputs the employee information using the getter method
        JOptionPane.showMessageDialog(null, "Employee Name: " + employee.getName() +
            "\nEmployee Number: " + employee.getEmployeeNumber() + "\nHire Date: " + employee.getHireDate() +
                "\nShift: " + employee.getShift() + "\nPay Rate: " + employee.getHourlyPayRate());

    }
}

class Employee{//super class that has three fields name, employee number and hire date.

    //defining the variables
    private String name;
    private String employeeNumber;
    private String hireDate;

    //constructor that takes the parameters and initializes them
    public Employee(String name, String employeeNumber, String hireDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate =hireDate;
    }

    //getter or accessors that will retrieve the values of the fields when called
    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    //setters or mutators are used to modify the values
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}

class ProductionWorker extends Employee{ //subclass that extends the employee class and allows the use of employees parameters

    //adds two variables that can be used for production workers
    private int shift;
    private double hourlyPayRate;

    //constructor that takes the parameters of the employee super class as well as the production worker class
    public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate){
        super(name, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
        }

    //getter or accessors that will retrieve the values of the fields when called
    public int getShift(){
        return shift;
    }
    public double getHourlyPayRate(){
        return hourlyPayRate;
    }

    //setters or mutators are used to modify the values
    public void setShift(int shift) {
        this.shift = shift;
    }
    public void setHourlyPayRate(double hourlyPayRate){
        this.hourlyPayRate = hourlyPayRate;
    }
}