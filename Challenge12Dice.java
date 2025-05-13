package org.poblete.challenge12; // package the classes belongs to

import java.util.Random; //allows for random integers

public class Challenge12Dice {
    public int sides = 6; // sets the number of sides of the dice
    private int dice1; // will hold the value for the first dice
    private int dice2; //will hold the value for the second dice

    // constructor to initialize the dice
    public Challenge12Dice() {
        roll(); // calls the method to roll the dice
    }

    public void roll() { // method that will roll the dice and give a random value
        Random num = new Random();
        dice1 = num.nextInt(sides) + 1;
        dice2 = num.nextInt(sides) + 1;// ensures the random number is between 1-6 instead of 0-5
    }
    public int getDiceNumber1() { // method to retrieve the number
        return dice1;
    }
    public int getDiceNumber2() {
        return dice2;
    }
    public int sum(){
        return dice1 + dice2;
    }
}

