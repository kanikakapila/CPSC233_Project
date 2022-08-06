package application;

import java.util.ArrayList;

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
    private Label horseErrorLabel;
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
    private Label totalCostLabel;
    
    @FXML
    private Label CostLabel;
    
    @FXML
    private Label description;
    
    @FXML
    private Label monthlyLabel;
    
    @FXML
    private Label ESize;
    
    public double getTireCost() {
    	double tireCost=0;
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
    	/// if no tires is selected  then default charge for all season tires;
    	if (!summerTires.isSelected() && !winterTires.isSelected() && !offTires.isSelected() && !performanceTires.isSelected() && !allTires.isSelected()) {
    		tireCost+=240.74;
    		//Selects all season tires automatically
    		allTires.setSelected(true);
    	}
		return tireCost;
    }
    
    public double getTransmissionCost() {
    	double transmissionCost=0;
    	if (autoTrans.isSelected()) {
    		transmissionCost+=2433;
    	}
    	else if(manualTrans.isSelected()) {
    		transmissionCost+=1560.64;
    	}
    	else if (dualTrans.isSelected()) {
    		transmissionCost+=3000.21;
    	}
    	else {
    		transmissionCost=1560.64;
    	}
		return transmissionCost;
    }
    
    public double getSafetyFeaturesCost() { 
		int safetyFeaturesCost = 0;
	
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
	if(!airBags.isSelected() && !antiLBrakes.isSelected() && !smartSus.isSelected()
			&& electronicStab.isSelected()) {
		safetyFeaturesCost += 6000;
		airBags.setSelected(true);
		
	}
	return safetyFeaturesCost;
	}
 
    public double cost() { 
    	//Keeps Track of the Price
    	double costOfCar=0;
    	//Engine
    	double engineCost=0;
    	//Fuel
    	double fuelCost=0;
    	//Tire
    	double tireCost=0;
    	//TransmissionType
    	double transmissionCost=0;
    	//HorsePower
    	double hPCost=0;
    	
    	//car type and color
    	double carTypeCost = 0; 
    	double colourCost = 150;   
    	//number of seats   
    	double seatCost = 0;
    
    	//additional lights
    	double lightCost = 0; 
    	//safety features
    	double safetyFeaturesCost = 0;
 
    	// Engine
    	PerformanceCost Engine= new PerformanceCost(engineSlider.getValue());
    	engineCost= Engine.getEngineCost(engineSlider.getValue());
    	
    	// Fuel
    	String fuel= (String) fuelType.getValue();
    	PerformanceCost Fuel=new PerformanceCost(fuel);
    	fuelCost=Fuel.getFuelCost(fuel);
    	
    	// Tires
    	tireCost=getTireCost();

    	//Transmisiion
    	transmissionCost=getTransmissionCost();
    	

    	// HorsePower
    	String h = horsepower.getText(); 
    	boolean horsepowerCheck = true;
    	for(char c: h.toCharArray()) {
    		if(!Character.isDigit(c)) {
    			horsepowerCheck = false; 
    			horseErrorLabel.setText("You cannot use" + c+ "as a horsepower. It should be some number between 100 and 500. Horsepower is set to Default Value.");
    			h = "0";
    		}
    	}
    	
    	
    	double horse= Double.parseDouble(h); 
	
	
    	PerformanceCost horseP=new PerformanceCost(horse,engineSlider.getValue());
    	double engineChosen=engineSlider.getValue();
    	
    	
    	hPCost=horseP.getHorsepowerCost(horse,engineChosen);

    	//Car Type 
    	String carTypeChosen= (String) carType.getValue();   
    	AppearanceCost carCost = new AppearanceCost(carTypeChosen);  
    	carTypeCost = carCost.getCarTypeCost(carTypeChosen);
    
    	
    	
    	
    	
    	
    	
    	//number of seats 
    	AppearanceCost Seats= new AppearanceCost(seatSlider.getValue());
    	seatCost= Seats.getSeatCost(seatSlider.getValue());
    	
    	
    	//Light Cost  
    	
    	
    	String lights= (String) addLights.getValue(); 
    	AppearanceCost lightTypeCost = new AppearanceCost(lights);
    	lightCost = lightTypeCost.getLightsCost(lights);
    	
    	//Safety features  
    	safetyFeaturesCost  =  getSafetyFeaturesCost();
    

    	PerformanceCost performanceCost=  new PerformanceCost(engineCost,fuelCost,tireCost,transmissionCost,hPCost) ; 
    	AppearanceCost appearanceCost = new AppearanceCost(colourCost,carTypeCost, seatCost, lightCost, safetyFeaturesCost);
    	costOfCar = performanceCost.getPerformanceCost() + appearanceCost.TotalAppearanceCost();
    	
    	return costOfCar;
	}
    
    @FXML 
    void fullPaymentCost(ActionEvent event) {
    	double costofCar = cost();
    	
    	// Output Screen
    	CostLabel.setText(String.format("Your total cost of the car in CAD :  %.1f", costofCar ));
    	totalCostLabel.setText(String.format("Your payment method is full hence the interest is zero"));
    	double monthlyCost=0;
    	//Monthly Cost
    	if (costofCar<=15000){
    		//Fuel
    		monthlyCost+=125;
    		//Insurance
    		monthlyCost+=114;
    		//Maintenance
    		monthlyCost+=40;
    	}
    	else if ((costofCar>15000) &&(costofCar<=25000)){
    		//Fuel
    		monthlyCost+=135;
    		//Insurance
    		monthlyCost+=124;
    		//Maintenance
    		monthlyCost+=50;
    		
    	}
    	else if ((costofCar>25000) &&(costofCar<40000)){
    		//Fuel
    		monthlyCost+=145;
    		//Insurance
    		monthlyCost+=144;
    		//Maintenance
    		monthlyCost+=60;
    	}
    	else {
    		//Fuel
    		monthlyCost+=155;
    		//Insurance
    		monthlyCost+=160;
    		//Maintenance
    		monthlyCost+=70;
    		
    	}	
    	monthlyLabel.setText(String.format("Your total cost of the car in CAD :  %.1f", monthlyCost ));
    	
    	
    	}
    	
    	
    	
   



	@FXML
    void halfDownCost(ActionEvent event) {
     double costOfCar = cost();
    	
    	double interest= (10.0/100)*costOfCar;
    	
    	
    	double half= (50.0/100)* costOfCar;
    	
    	double monthly = costOfCar-half;
    	double total = (monthly+interest)/12;
    	
    	CostLabel.setText(String.format("Your total cost of the car in CAD including interest :  %.1f", costOfCar+interest ));
    	System.out.println("half");
    	totalCostLabel.setText(String.format("Your total downpayment of the car in CAD "
    			+ "is  %.1f and your monthly payment for each month for the next 12 months : %.2f", half,total ));
    	
    	double monthlyCost=0;
    	//Monthly Cost
    	if (costOfCar<=15000){
    		//Fuel
    		monthlyCost+=125;
    		//Insurance
    		monthlyCost+=114;
    		//Maintenance
    		monthlyCost+=40;
    	}
    	else if ((costOfCar>15000) &&(costOfCar<=25000)){
    		//Fuel
    		monthlyCost+=135;
    		//Insurance
    		monthlyCost+=124;
    		//Maintenance
    		monthlyCost+=50;
    		
    	}
    	else if ((costOfCar>25000) &&(costOfCar<40000)){
    		//Fuel
    		monthlyCost+=145;
    		//Insurance
    		monthlyCost+=144;
    		//Maintenance
    		monthlyCost+=60;
    	}
    	else {
    		//Fuel
    		monthlyCost+=155;
    		//Insurance
    		monthlyCost+=160;
    		//Maintenance
    		monthlyCost+=70;
    		
    	}	
    	monthlyLabel.setText(String.format("Your total cost of the car in CAD :  %.1f", monthlyCost ));
    	
    	
    	
    	
    	
    }
    @FXML
    void quarterDownCost(ActionEvent event) {
    	double costOfCar = cost();
    	
    	
    	double interest= (15.0/100)*costOfCar;
    	
    	
    	double half= (25.0/100)*costOfCar;
    	
    	double monthly = costOfCar-half;
    	double total = (monthly+interest)/24;
    	
    	CostLabel.setText(String.format("Your total cost of the car in CAD including interest :  %.1f", interest+costOfCar ));
    	totalCostLabel.setText(String.format("Your total downpayment of the car in CAD "
    			+ "is  %.1f and your monthly payment for each month for the next 24 months : %.2f", half,total ));    	
    	System.out.println("quarter");
    	
    	
    	double monthlyCost=0;
    	//Monthly Cost
    	if (costOfCar<=15000){
    		//Fuel
    		monthlyCost+=125;
    		//Insurance
    		monthlyCost+=114;
    		//Maintenance
    		monthlyCost+=40;
    	}
    	else if ((costOfCar>15000) &&(costOfCar<=25000)){
    		//Fuel
    		monthlyCost+=135;
    		//Insurance
    		monthlyCost+=124;
    		//Maintenance
    		monthlyCost+=50;
    		
    	}
    	else if ((costOfCar>25000) &&(costOfCar<40000)){
    		//Fuel
    		monthlyCost+=145;
    		//Insurance
    		monthlyCost+=144;
    		//Maintenance
    		monthlyCost+=60;
    	}
    	else {
    		//Fuel
    		monthlyCost+=155;
    		//Insurance
    		monthlyCost+=160;
    		//Maintenance
    		monthlyCost+=70;
    		
    	}	
    	monthlyLabel.setText(String.format("Your total cost of the car in CAD :  %.1f", monthlyCost ));
    	
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
}