/*
Author: Jeremiah Poblete
Class: IS-2063
04/-7/2024
*/


// This program will take test scores validate the inputs and average out the scores.
// Will use try/catch blocks to handle exceptions as well as throwing exceptions if not within the desired range

import javax.swing.*; // allows for GUI based programming

public class challenge11_jeremiah_poblete {

    public static void main(String[] args){

        try{ // try and except block that will throw exception if there is an illegal argument
            // prompts for user input
            String input = JOptionPane.showInputDialog( null,
                    "Enter test scores seperated by commas: ");

            // splits the string into individual test scores seperated by commas
            String[] splitScores = input.split(",");

            int[] scores = new int[splitScores.length]; // creates an array large enough for each test score

            // for loop that takes each score from the splitScores array and adds it into the scores array
            for (int i = 0; i < splitScores.length; i++){
                scores[i] = Integer.parseInt(splitScores[i].trim());
            }
            TestScores testScores = new TestScores(scores); // creates an object  with the parsed scores
            double average = testScores.average(); // calculates the average using the called method

            // displays the average score
            JOptionPane.showMessageDialog(null, "The average score is: " + average);

        }catch (IllegalArgumentException e) {
            // if an illegal argument exception occurs, displays an error message
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error: ", JOptionPane.ERROR_MESSAGE);
        }
    }
}

class TestScores{ // class that accepts an array of test score and holds different methods to validate and average scores
    public int[] scores; // array that will store the test scores

    public TestScores(int[] scores){ //constructor to initialize the object with the scores
        this.scores = scores;
        validateScores(); //calls validateScores method to ensure they are within the range.
    }

    private void validateScores() { // method to validate scores
        for (int score: scores){ // iterates through each score
            if (score < 0 || score > 100) { // if scores are not between 0 and 100, throws an Illegal Argument Exception
                throw new IllegalArgumentException("Test score must be between 0 and 100"); // message that is sent when thrown
            }
        }
    }

    public double average() { // method that calculates the average test scores
        double sum = 0;
        for (int score:scores) { // iterates through each score and adds them together
            sum+=score;
        }return sum /scores.length; //returns the average by dividing by the number of scores
    }
}