package org.poblete.challenge13;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;

import java.util.HashMap;

public class CalculatorController {
    // controls for JavaFX
    @FXML
    private ComboBox<String> dorm;
    @FXML
    private ComboBox<String> mealPlan;
    @FXML
    private Button calculate;
    @FXML
    private Label result;

    // hashmaps that will store dorm and meal plan prices
    private HashMap<String,Integer> dormPrices;
    private HashMap<String,Integer> mealPlanPrices;

    // constructor  that will initialize the hashmaps
    public CalculatorController() {
        dormPrices = new HashMap<>(); //initializes the dorm prices
        dormPrices.put("Allen Hall: $1,800 per semester", 1800);
        dormPrices.put("Pike Hall: $2,200 per semester", 2200);
        dormPrices.put("Farthing Hall: $2,800 per semester", 2800);
        dormPrices.put("University Suites: $3,000 per semester", 3000);

        mealPlanPrices = new HashMap<>(); //initializes the meal plan prices
        mealPlanPrices.put("7 meals per week: $600 per semester", 600);
        mealPlanPrices.put("14 meals per week: $1,100 per semester", 1100);
        mealPlanPrices.put("Unlimited meals: $1,800 per semester", 1800);
}
    // initialize method that is called when program starts
    @FXML
    public void initialize() {
        dorm.getItems().addAll(dormPrices.keySet());
        mealPlan.getItems().addAll(mealPlanPrices.keySet());
    }

    //method that adds the prices of the dorm and meal plan together
    @FXML
    public void calculate(){
        //gathers the value that is stored in the hashmap
        String selectedDorm = dorm.getValue();
        String selectedMealPlan = mealPlan.getValue();

        // ensures that a dorm and meal plan are chosen
        if (selectedDorm != null && selectedMealPlan != null) {
            int dormPrice = dormPrices.getOrDefault(selectedDorm, 0);
            int mealPlanPrice = mealPlanPrices.getOrDefault(selectedMealPlan,0);

            int totalCost = dormPrice + mealPlanPrice; //calculates the total cost
            result.setText("The total price for your plan is: $" + totalCost +" per semester");
        }else{
            //prompts user to select a dorm and a meal plan if they do not select one
            result.setText("Please choose a dorm and a meal plan.");
        }
    }
}