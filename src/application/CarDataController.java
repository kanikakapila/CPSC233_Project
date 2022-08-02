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
    	double eCost=1.08;
    	double engineCost=0;
    	//Fuel
    	double fuelCost=0;
    	//Tire
    	double tireCost=0;
    	//TransmissionType
    	double transmissionCost=0;
    	//HorsePower
    	double hPCost=0;
    	double hpMultiplier=12.27; 
    	//car type and color
    	double carTypeCost = 0; 
    	double colourCost = 150;   
    	//number of seats   
    	double seatCost = 0;
    	double numberOfSeats = 138.43;  
    	//additional lights
    	double lightCost = 0; 
    	//safety features
    	double safetyFeaturesCost = 0;
    	
    	
    	
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
    	 if (summerTires.isSelected()) {
    		 tireCost+=280.22;
    	 }
    	if (winterTires.isSelected()){
    		tireCost+=290.84;
    	}
    	if (offTires.isSelected()){
    		tireCost+=350.36;
    	}
    	if (performanceTires.isSelected()){
    		tireCost+=425.22;
    	}
    		
    	if (allTires.isSelected()) {
    		tireCost+=240.74;
    	}
    	//Transmisiion
    	
    	if (autoTrans.isSelected()) {
    		transmissionCost+=2433;
    	}
    	else if(manualTrans.isSelected()) {
    		transmissionCost+=1560.64;
    	}
    	else if (dualTrans.isSelected()) {
    		transmissionCost+=3000.21;
    	}
    	
    	// HorsePower
    	double horse= Double.parseDouble(horsepower.getText());
    	hPCost=horse*hpMultiplier;

    	//Car Type 
    	String carTypeChosen= (String) carType.getValue(); 
    	if(carTypeChosen =="SUV") { 
    		carTypeCost += 3000;
    		 
    	} 
    	else if(carTypeChosen == "Sedan") { 
    		carTypeCost += 2500;
    		
    	} 
    	else if(carTypeChosen == "Van") { 
    		carTypeCost += 3300;
    		
    	} 
    	else if(carTypeChosen == "Hatchback") { 
    		carTypeCost += 1700;
    		
    	} 
    	else if(carTypeChosen == "Limousine") { 
    		carTypeCost += 4000 ;
    		
    	} 
    	else if(carTypeChosen == "Truck") { 
    		carTypeCost += 4500;
    		
    	} 
    	else { 
    		carTypeCost += 5000 ;
    		
    	} 
    	//number of seats 
    	seatCost = seatSlider.getValue()*numberOfSeats; 
    	
    	//Light Cost 
    	String lights= (String) addLights.getValue(); 
    	if(lights =="Head Lights") { 
    		lightCost += 200;
    		 
    	} 
    	else if(lights == "Tail Lights") { 
    		lightCost += 438;
    		
    	} 
    	else if(lights == "Signal Lights") { 
    		lightCost += 150;
    		
    	} 
    	else if(lights == "Hazard Lights") { 
    		lightCost += 60;
    		
    	} 
    	else if(carTypeChosen == "Fog Lights") { 
    		lightCost += 150 ;
    		
    	} 
    	else if(carTypeChosen == "Daytime Running Lights") { 
    		lightCost += 50;
    		
    	}  
    	
    	else { 
    		lightCost +=  80;
    		
    	} 
    	
    	//Safety features
    	if(airBags.isSelected()) { 
    		safetyFeaturesCost += 6000;
    		
    	} 
    	if(antiLBrakes.isSelected()) { 
    		safetyFeaturesCost +=550 ;
    		
    	}
    	if(smartSus.isSelected()) {
    		safetyFeaturesCost += 1800 ;
    	}
    	if(electronicStab.isSelected()) {
    		safetyFeaturesCost += 100;
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	double performanceCost= engineCost + fuelCost + tireCost + transmissionCost + hPCost ; 
    	//appearance 
    	double appearanceCost = colourCost+carTypeCost+seatCost+lightCost+safetyFeaturesCost;
    	costOfCar = performanceCost + appearanceCost ;
    	
    	//Debugging 
    	System.out.println("EC:" + engineCost);
    	System.out.println("FC:" + fuelCost);
    	System.out.println("TC:" + tireCost);
    	System.out.println("TransCost:" + transmissionCost);
    	System.out.println("HorseCost:" + hPCost);
    	System.out.println("full"); 
    	System.out.println("Car Type Cost" + carTypeCost); 
    	System.out.println("Number of seats cost"+seatCost); 
    	System.out.println("Light Cost:" + lightCost); 
    	System.out.println("Safety Cost:" + safetyFeaturesCost);
    	
    	
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