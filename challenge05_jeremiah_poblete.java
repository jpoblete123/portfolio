/*
Author: Jeremiah Poblete
Class: IS-2063
02/17/2024
*/


// This program will play a game of rock, paper scissors
import javax.swing.JOptionPane; //allows for the use of JOptionPane GUI
import java.util.Random; //allows for random variables

public class challenge05_jeremiah_poblete {

    public static void main(String[] args){
        String result; //local variable for that stores the result of the winner

        //do while loop that allows for the program to be played again if there is a tie
        do {
            //method calls that will store the choices of user and computer. It will then determine the result
            int computerResult = computerChoice();
            int userResult = userChoice();
            choice(computerResult);
            result = matchResult(userResult, computerResult);

            JOptionPane.showMessageDialog(null, result); //displays the match result
        }
        while(result.equals("It's a tie! You must play again to determine a winner"));

    }

    public static int computerChoice(){ //determines computer choice using random function

        Random randomNumbers = new Random(); //creates random variable

        int number;
        number = randomNumbers.nextInt(3) + 1; //random integer assigned to number

        return number; //returns the random number
    }

    public static int userChoice(){ //method that prompts for user choice

        int number = 0;

        //do while loop that will prompt user to only chose rock, paper, scissors
        do {
            String userInput = JOptionPane.showInputDialog("Please enter rock, paper, or scissors");

            if (userInput.equals("rock")) {
                number = 1;
            } else if (userInput.equals("paper")) {
                number = 2;
            } else if (userInput.equals("scissors")) {
                number = 3;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Please only enter rock, paper, or scissors");
            }
        } while(number == 0); //will continue to loop if integer is still 0

        return number; //returns number correlating with user choice
    }

    public static void choice(int choice){ //method that displays computer choice
        if (choice == 1){
            JOptionPane.showMessageDialog(null, "Computer chose rock");
        }else if (choice == 2){
            JOptionPane.showMessageDialog(null, "Computer chose paper");
        }else{
            JOptionPane.showMessageDialog(null, "Computer chose scissors");
        }
    }

    //method that takes user and computer input and determines the input using if/elif functions
    public static String matchResult(int user, int computer){
        if (user == computer){
            return "It's a tie! You must play again to determine a winner";
        } else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) ||
                (user == 3 && computer == 2)){
            return "You win!";
        }else{
            return "Computer wins!";
        }
    }
}
