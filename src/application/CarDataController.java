package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class CarDataController {

    @FXML
    private ToggleButton manualTrans;

    @FXML
    private CheckBox offTires;

    @FXML
    private Label horsePower;

    @FXML
    private Slider seatSlider;

    @FXML
    private CheckBox summerTires;

    @FXML
    private Label yourEngineSize;

    @FXML
    private TextField horsepower;

    @FXML
    private ColorPicker color;

    @FXML
    private CheckBox allTires; 

    @FXML
    private ChoiceBox<?> addLights;

    @FXML
    private CheckBox winterTires;

    @FXML
    private ChoiceBox<?> FXCollections;

    @FXML
    private ToggleButton dualTrans;

    @FXML
    private Label typeOfTires;

    @FXML
    private ToggleButton autoTrans;

    @FXML
    private ChoiceBox<?> carType;

    @FXML
    private CheckBox antiLBrakes;

    @FXML
    private Slider engineSlider;

    @FXML
    private CheckBox smartSus;

    @FXML
    private CheckBox electronicStab;

    @FXML
    private Label transmissionType;

    @FXML
    private CheckBox airBags;

    @FXML
    private CheckBox performanceTires;
    
    @FXML
    private Button quarterDown;
    
    @FXML
    private Button halfDown;
    
    @FXML
    private Button fullPayment; 
    @FXML
    private ChoiceBox<?> fuelType;
    
    @FXML 
    void fullPaymentCost(ActionEvent event) {
    	//Keeps Track of the Price
    	double costOfCar=0;
    	// Engine Multiplier
    	double eCost=1.58;
    	double engineCost=0;
    	//Fuel
    	double fuelCost=0;
    	//Tire
    	double tireCost=0;
    	
    	
    	// Engine Cost Calculator
    	engineCost+= (engineSlider.getValue())*eCost;
    	
    	// Fuel Type
    	
    	String fuel= (String) fuelType.getValue();
    	if (fuel=="Electric") {
    		fuelCost+=2500.63;
    	}
    	else if (fuel=="Petrol") {
    		fuelCost+=1400.75;
    	}
    	else if (fuel=="Hyrbid") {
    		fuelCost+=1600.25;
    	}
    	else {
    		fuelCost+=1350.92;
    	}
    	
    	// Tires
    	
    	
    	
    	
    	
    	
    	
    	
    	costOfCar= engineCost + fuelCost;
    	
    	//Debugging 
    	System.out.println("EC:" + engineCost);
    	System.out.println("FC:" + fuelCost);
 
    	System.out.println("full");
    	System.out.println("Car Cost:" + costOfCar);
    	
    	
    	
    	
    }
    @FXML
    void halfDownCost(ActionEvent event) {
    	//Keeps Track of the Price
    	double costOfCar=0; 
    	System.out.println("half");
    	
    	
    	
    	
    }
    @FXML
    void quarterDownCost(ActionEvent event) {
    	//Keeps Track of the Price
    	double costOfCar=0;
    	
    	
    	System.out.println("quarter");
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
}