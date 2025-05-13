// Author: Jeremiah Poblete
// Class: IS-2063
// 1/27/2024

// This program gathers input using the scanner class

//Import that allows for the use of the scanner class
import java.util.Scanner;

public class challenge02_jeremiahPoblete {

    public static void main(String[] args){

        //Variables to store user input
        String userName;
        int userAge;
        String userColor;
        int numberOfPeople;

        Scanner keyboard = new Scanner(System.in); // Scanner class that allows to store input of users

        System.out.println("Please enter your name: ");
        userName = keyboard.nextLine();

        System.out.println("Please enter your age: ");
        userAge = keyboard.nextInt();

        keyboard.nextLine(); //Consumes the remaining newline after pressing enter

        numberOfPeople = 2024 - userAge;

        System.out.println("Please enter your favorite color: ");
        userColor = keyboard.nextLine();



        System.out.println("In 2024, a giant "+ userColor +" spaceship landed on Earth carrying "+ numberOfPeople +
                " people. What's even stranger is that the number of people on board the ship was also the year in " +
                "which you, "+ userName + ", were born!");
    }
}
