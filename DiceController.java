package org.poblete.challenge12; // package the classes belongs to

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class DiceController {
    @FXML
    private Label diceResult1; // Label that displays the 1st rolled number

    @FXML
    private Label diceResult2; // Label that will display the 2nd rolled number

    @FXML
    protected void onRoll() { // roll method that will roll the dice

        Random rand = new Random(); // calls new random object to allow the use of random number
        //sets the parameters of the random variables
        int n1 = rand.nextInt(6) + 1;
        int n2 = rand.nextInt(6) + 1;

        //first die that will display the image once rolled. Will determine image using if statement
        if (n1 == 1) {
            ImageView diceImage1 = new ImageView(new Image(getClass().getResourceAsStream("dice1.png")));
            diceImage1.setFitHeight(100);
            diceImage1.setFitWidth(100);
            diceImage1.setPreserveRatio(true);
            diceResult1.setGraphic(diceImage1);
        }else if (n1 == 2){
                ImageView diceImage1 = new ImageView(new Image(getClass().getResourceAsStream("dice2.png")));
            diceImage1.setFitHeight(100);
            diceImage1.setFitWidth(100);
            diceImage1.setPreserveRatio(true);
                diceResult1.setGraphic(diceImage1);
        }else if (n1 == 3) {
            ImageView diceImage1 = new ImageView(new Image(getClass().getResourceAsStream("dice3.png")));
            diceImage1.setFitHeight(100);
            diceImage1.setFitWidth(100);
            diceImage1.setPreserveRatio(true);
            diceResult1.setGraphic(diceImage1);
        }else if (n1 == 4) {
            ImageView diceImage1 = new ImageView(new Image(getClass().getResourceAsStream("dice4.png")));
            diceImage1.setFitHeight(100);
            diceImage1.setFitWidth(100);
            diceImage1.setPreserveRatio(true);
            diceResult1.setGraphic(diceImage1);
        }else if (n1 == 5) {
            ImageView diceImage1 = new ImageView(new Image(getClass().getResourceAsStream("dice5.png")));
            diceImage1.setFitHeight(100);
            diceImage1.setFitWidth(100);
            diceImage1.setPreserveRatio(true);
            diceResult1.setGraphic(diceImage1);
        }else {
            ImageView diceImage1 = new ImageView(new Image(getClass().getResourceAsStream("dice6.png")));
            diceImage1.setFitHeight(100);
            diceImage1.setFitWidth(100);
            diceImage1.setPreserveRatio(true);
            diceResult1.setGraphic(diceImage1);
        }

        //second die that will display the image once rolled. Will determine image using if statement
        if (n2 == 1) {
            ImageView diceImage2 = new ImageView(new Image(getClass().getResourceAsStream("dice1.png")));
            diceImage2.setFitHeight(100);
            diceImage2.setFitWidth(100);
            diceImage2.setPreserveRatio(true);
            diceResult2.setGraphic(diceImage2);
        }else if (n2 == 2){
            ImageView diceImage2 = new ImageView(new Image(getClass().getResourceAsStream("dice2.png")));
            diceImage2.setFitHeight(100);
            diceImage2.setFitWidth(100);
            diceImage2.setPreserveRatio(true);
            diceResult2.setGraphic(diceImage2);
        }else if (n2 == 3) {
            ImageView diceImage2 = new ImageView(new Image(getClass().getResourceAsStream("dice3.png")));
            diceImage2.setFitHeight(100);
            diceImage2.setFitWidth(100);
            diceImage2.setPreserveRatio(true);
            diceResult2.setGraphic(diceImage2);
        }else if (n2 == 4) {
            ImageView diceImage2 = new ImageView(new Image(getClass().getResourceAsStream("dice4.png")));
            diceImage2.setFitHeight(100);
            diceImage2.setFitWidth(100);
            diceImage2.setPreserveRatio(true);
            diceResult2.setGraphic(diceImage2);
        }else if (n2 == 5) {
            ImageView diceImage2 = new ImageView(new Image(getClass().getResourceAsStream("dice5.png")));
            diceImage2.setFitHeight(100);
            diceImage2.setFitWidth(100);
            diceImage2.setPreserveRatio(true);
            diceResult2.setGraphic(diceImage2);
        }else {
            ImageView diceImage2 = new ImageView(new Image(getClass().getResourceAsStream("dice6.png")));
            diceImage2.setFitHeight(100);
            diceImage2.setFitWidth(100);
            diceImage2.setPreserveRatio(true);
            diceResult2.setGraphic(diceImage2);
        }

    }
}