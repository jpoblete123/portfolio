/*
Author: Jeremiah Poblete
Class: IS-2063
03/03/2024
*/


// This program will create a payroll class that will prompt user for hours worked and poy rate. It will then calculate
// gross pay rate and output employee information

import javax.swing.JOptionPane; // allows for the use of GUIs
import java.io.IOException; // handles IO exceptions

public class challenge07_jeremiah_poblete {

    public static void main(String[] args) throws IOException{
        EmployeeMenu.displayMenu(); // calls the display menu method under the EmployeeMenu class
    }
}
class EmployeeMenu{ // will prompt for user input and output
    public static void displayMenu() {
        Pay pay = new Pay(); // creates an instance of the pay class to access the methods
        pay.enterData(); // calls the enterData method that will collect data of employees

        int choice;
        do { //do while loop that will validate user input
            choice = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Please choose an Option:
                    1. Total Wages for specific employee
                    2. Total Wages for all employees
                    3. Exit the program\s"""));

            switch (choice) {
                case 1:
                    int employeeId = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Please enter an Employee ID: "));
                    specificEmployee(pay, employeeId); // calls a specified employee method and sends the employee ID
                    break;
                case 2:
                    allEmployees(pay); // calls all employee method that will output all employee information
                    break;
                case 3:
                    break; // exits the program
                default:
                    JOptionPane.showMessageDialog(null, "Please choose from the choices listed");
            }
        } while (choice != 3);
    }

    private static void specificEmployee(Pay pay, int employeeId){
        for (int i = 0; i < pay.employeeId.length; i++){ // loops through employee IDs
            if (pay.employeeId[i] == employeeId){ // checks if the employee id matches the array
                // displays employee information
                JOptionPane.showMessageDialog(null, "Employee ID: " + employeeId +
                        "\nHours Worked: " + pay.getHours(i) +
                        "\nPay Rate: " + pay.getPayRate(i) +
                        "\n Gross Wages: " + pay.getWages(i));
            }
        }
    }
    private static void allEmployees(Pay pay){
        for (int i = 0; i <pay.employeeId.length; i++) { //loops through the employee IDs
            // displays all employee information
            JOptionPane.showMessageDialog(null, "Employee ID: " + pay.employeeId[i] +
                    "\nHours Worked: " + pay.getHours(i) +
                    "\nPay Rate: " + pay.getPayRate(i) +
                    "\n Gross Wages: " + pay.getWages(i));
        }
    }

}
class Pay{
    // arrays that store the employee data
    int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7850489};
    int[] hours = new int[7];
    double[] payRate = new double[7];
    double[] wages = new double[7];

    // accessors and mutators methods for the employee data
    public void setHours(int index, int hoursWorked) {
        hours[index] = hoursWorked;
    }
    public int getHours(int index) {
        return hours[index];
    }
    public void setPayRate(int index, double rate) {
        payRate[index] = rate;
    }
    public double getPayRate(int index) {
        return payRate[index];
    }
    public double getWages(int index){
        return wages[index];
    }

    //method that collects the employee data
    public void enterData() {
        for (int i = 0; i < hours.length; i++){
            int time = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Please enter hours worked for employee " + employeeId[i]));
            setHours(i, time); // adds the hours worked for each employee

            double rate;
            do { //ensure the pay rate must be above $6 an hour
                rate = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Please enter pay rate for employee " + employeeId[i]));
                if (rate < 6.00){
                    JOptionPane.showMessageDialog(null, "Pay rate must greater than $6.00.");
                }
            }while(rate < 6);

            setPayRate(i, rate); // adds the pay rate for each employee
            wages[i] = time * rate; // calculates the gross wages by multiplying hours worked and pay rate
        }
    }
}



