// application file that will start the GUI Application
package org.poblete.challenge12; // package the classes belongs to

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException; // helps handle exceptions

public class DiceApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException { //sets stage of the program to built upon
        FXMLLoader fxmlLoader = new FXMLLoader(DiceApplication.class.getResource("Challenge12.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 750); // creates the inside that will encompass the GUI
        stage.setTitle("Dice Roll"); // creates the title of application
        stage.setScene(scene); // sets the scene
        stage.show(); // shows the application
    }

    // Main method that will launch the application
    public static void main(String[] args) {
        launch();
    }
}