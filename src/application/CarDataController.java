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
import javafx.scene.paint.Color;

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
    private ColorPicker color2;

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
    
    @FXML
    private Label insuranceLabel;
    
    @FXML
    private Label gasPriceLabel;
   
    @FXML
    private Label engineLabel;
    
    @FXML
    private Label fuelLabel;
    
    @FXML
    private Label seatLabel;
    
    @FXML
    private Label typeLabel;
    
    public double getTireCost() {
    	double tireCost=0;
    	double[] Price = new double[5];
    	 Price[0] = 280.22;
    	 Price[1]= 290.84;
    	 Price[2]= 350.36;
    	 Price[3]= 425.22;
    	 Price[4]= 240.75;
    	 if (summerTires.isSelected()) {
    		 tireCost+=Price[0];
    	 }
    	if (winterTires.isSelected()){
    		tireCost+=Price[1];
    	}
    	if (offTires.isSelected()){
    		tireCost+=Price[2];
    	}
    	if (performanceTires.isSelected()){
    		tireCost+=Price[3];
    	}
    		
    	if (allTires.isSelected()) {
    		tireCost+=Price[4];
    	}
    	/// if no tires is selected  then default charge for all season tires;
    	if (!summerTires.isSelected() && !winterTires.isSelected() && !offTires.isSelected() && !performanceTires.isSelected() && !allTires.isSelected()) {
    		tireCost+=Price[4];
    		//Selects all season tires automatically
    		allTires.setSelected(true);
    	}
		return tireCost;
    }
    
    public double getTransmissionCost() {
    	double transmissionCost=0;
    	double[] Price = new double[3];
   	 Price[0] = 2433; // Price for Auto
   	 Price[1]= 1560.64; // Price for Manual
   	 Price[2]=3000.21; // Price for dual
    	if (autoTrans.isSelected()) {
    		transmissionCost+=Price[0];
    	}
    	else if(manualTrans.isSelected()) {
    		transmissionCost+=Price[1];
    	}
    	else if (dualTrans.isSelected()) {
    		transmissionCost+=Price[2];
    	}
    	else {
    		transmissionCost=Price[1];
    	}
		return transmissionCost;
    }
    
    public double getSafetyFeaturesCost() { 
		int safetyFeaturesCost = 0;
		         //Airbags   Anti lock   Smart Suspension    Electronic Stability
	int[] Prices= {6000,     550,        1800,                 100};
	if(airBags.isSelected()) { 
		safetyFeaturesCost += Prices[0];
		
	} 
	if(antiLBrakes.isSelected()) { 
		safetyFeaturesCost +=Prices[1] ;
		
	}
	if(smartSus.isSelected()) { 
		safetyFeaturesCost +=Prices[2] ;
	}
	if(electronicStab.isSelected()) {
		safetyFeaturesCost += Prices[3];
	}
	if(!airBags.isSelected() && !antiLBrakes.isSelected() && !smartSus.isSelected()
			&& electronicStab.isSelected()) {
		safetyFeaturesCost +=Prices[0];
		airBags.setSelected(true);
		
	}
	return safetyFeaturesCost;
	}
    
    public double getColourCost(double carTypeCost) {
    	double colorCost=0;
    	// "Sedan","SUV","Van","Hatchback" Cost
    	double Cost1=450;
    	// "Limousine","Truck","Sports Car" cost
    	double Cost2=650;
    	
    	if(carTypeCost<=3500) {
    		colorCost=Cost1;
    	}
    	else {
    		colorCost=Cost2;
    	}
    	
    	
		return colorCost;
    	
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
    	double colourCost = 0;   
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
    	 
    	//Color
    	color2.setValue(color.getValue());

    	// HorsePower
    	String h = horsepower.getText();
    	//variable to display error
    	String y =horsepower.getText();

    	boolean horsepowerCheck = true;
    	for(char c: h.toCharArray()) {
    		if(!Character.isDigit(c)) {
    			horsepowerCheck = false; 
    			horseErrorLabel.setText("You cannot use " +y+ " as a horsepower. It should be some number between 100 and 500. Horsepower is automated according to your engine size.");
    			h="0";
    		}
    		else {
    			horsepowerCheck=true;
    		}
    	}
    	
    	double horse= Double.parseDouble(h); 
    	// Horsepower cannot exceed 500
    	if (horse>500 || horse<100) {
    		horseErrorLabel.setText("You cannot use " +y+ " as a horsepower. It should be some number between 100 and 500. Horsepower is automated according to your engine size.");
    		horse=0;
    	}
    	else if(horse<=500 && horse>=100) {
    		horseErrorLabel.setText("");
    	
    		
    	}
    	
    	
	
    	PerformanceCost horseP=new PerformanceCost(horse,engineSlider.getValue());
    	double engineChosen=engineSlider.getValue();
    	
    	
    	hPCost=horseP.getHorsepowerCost(horse,engineChosen);
    	
    	//Car Type 
    	String carTypeChosen= (String) carType.getValue();   
    	AppearanceCost carCost = new AppearanceCost(carTypeChosen);  
    	carTypeCost = carCost.getCarTypeCost(carTypeChosen);   	
    	
    	
    	//Color Cost
    	colourCost= getColourCost(carTypeCost);
    	
    	//number of seats 
    	double numberOfSeats= seatSlider.getValue();
   
    	AppearanceCost Seats= new AppearanceCost(numberOfSeats);
    	seatCost= Seats.getSeatCost(numberOfSeats);
    	
    	
    	//Light Cost  
    	
    	
    	String lights= (String) addLights.getValue(); 
    	AppearanceCost lightTypeCost = new AppearanceCost(lights);
    	lightCost = lightTypeCost.getLightsCost(lights);
    	
    	//Safety features  
    	safetyFeaturesCost  =  getSafetyFeaturesCost();
    

    	PerformanceCost performanceCost=  new PerformanceCost(engineCost,fuelCost,tireCost,transmissionCost,hPCost) ; 
    	AppearanceCost appearanceCost = new AppearanceCost(colourCost,carTypeCost, seatCost, lightCost, safetyFeaturesCost);
    	PerformanceLabourCost pLCost=new PerformanceLabourCost();
    	AppearanceLabourCost appCost= new AppearanceLabourCost();
    	double priceOfCar = performanceCost.getPerformanceCost(engineCost,fuelCost,tireCost,transmissionCost,hPCost) + appearanceCost.TotalAppearanceCost(colourCost,carTypeCost, seatCost, lightCost, safetyFeaturesCost); 
    	double labourCost= pLCost.CalculatePerfLabourCost(engineCost,fuelCost,tireCost,transmissionCost,hPCost) + appCost.CalculateAppLabourCost(colourCost,carTypeCost, seatCost, lightCost, safetyFeaturesCost);
    	
    	costOfCar= priceOfCar + labourCost;
    	return costOfCar;
	}
   
    
    public void getDescription() {
    	String fuel = "";
    	if (fuelType.getValue() == null) {
    		fuel="Diesel";
    	}
    	else {
    		fuel=(String) fuelType.getValue();
    	}
    	
    	String type="";
    	
    	if (carType.getValue()==null) {
    		type="Sports Car";
    	}
    	else {
    		type=(String) carType.getValue();
    	}
    	String h = horsepower.getText();
    	//variable to display error
    	String y =horsepower.getText();

    	boolean horsepowerCheck = true;
    	for(char c: h.toCharArray()) {
    		if(!Character.isDigit(c)) {
    			horsepowerCheck = false; 
    			horseErrorLabel.setText("You cannot use " +y+ " as a horsepower. It should be some number between 100 and 500. Horsepower is automated according to your engine size.");
    			h="0";
    		}
    		else {
    			horsepowerCheck=true;
    		}
    	}
    	double horse= Double.parseDouble(h);
    	
    	
    	if (horsepower.getText().equals("0")|| horse>500 || horse<100){
    		horse=engineSlider.getValue()*500/5000;
    	}
    	engineLabel.setText(String.format("Your engine size:  %.1f", engineSlider.getValue() ));
    	fuelLabel.setText(String.format("Your fuel type:  "+ fuel+"               HorsePower of car: "+ horse));
    	seatLabel.setText(String.format("Number of seats:  %.0f", seatSlider.getValue()));
    	typeLabel.setText(String.format("Type of car:  "+ type));
    }
    
    @FXML 
    void fullPaymentCost(ActionEvent event) {
    	double costofCar = cost();
    	
    	// Output Screen
    	getDescription();
    	CostLabel.setText(String.format("Your total cost of the car in CAD :  %.1f", costofCar ));
    	totalCostLabel.setText(String.format("Your payment method is full hence the interest is zero"));
    	double insuranceCost=0;
    	double gasPrice=0;
    	
    	
    	//Insurance
    	
    	MonthlyCost i= new MonthlyCost(costofCar);
    	insuranceCost=i.getInsurance(costofCar);
    	
    	//GasPrice
    	String FuelTypeChosenGas= (String)fuelType.getValue();
    	
    	if (FuelTypeChosenGas==null) {
    		FuelTypeChosenGas="Diesel";
    	}
    	
    	MonthlyCost g=new MonthlyCost(FuelTypeChosenGas);
    	gasPrice= g.getGasPrice(FuelTypeChosenGas);
    	
    	// Total
    	double monthlyCost=insuranceCost+gasPrice;
    	//Description
    	monthlyLabel.setText(String.format("Your monthly cost of the car in CAD :  %.1f", monthlyCost));
    	insuranceLabel.setText(String.format("Insurance:  %.1f", insuranceCost));
    	gasPriceLabel.setText(String.format("Estimated Gas Cost:  %.1f", gasPrice));
    	
    	
    	}
    	
    	
    	
   



	@FXML
    void halfDownCost(ActionEvent event) {
     double costofCar = cost();
    	double interest= (10.0/100)*costofCar;
    	
    	
    	double half= (50.0/100)* costofCar;
    	
    	double monthly = costofCar-half;
    	double total = (monthly+interest)/12;
    	
    	CostLabel.setText(String.format("Your total cost of the car in CAD including interest :  %.1f", costofCar+interest ));
    	
    	totalCostLabel.setText(String.format("Your total downpayment of the car in CAD "
    			+ "is  %.1f and your monthly payment for each month for the next 12 months : %.2f", half,total ));
    	
    	double insuranceCost=0;
    	double gasPrice=0;
    	
    	
    	//Insurance
    	
    	MonthlyCost i= new MonthlyCost(costofCar);
    	insuranceCost=i.getInsurance(costofCar);
    	
    	//GasPrice
    	String FuelTypeChosenGas= (String)fuelType.getValue();
    	
    	if (FuelTypeChosenGas==null) {
    		FuelTypeChosenGas="Diesel";
    	}
    	
    	MonthlyCost g=new MonthlyCost(FuelTypeChosenGas);
    	gasPrice= g.getGasPrice(FuelTypeChosenGas);
    	
    	// Total
    	double monthlyCost=insuranceCost+gasPrice;
    	//Description
    	getDescription();
    	
    	monthlyLabel.setText(String.format("Your monthly cost of the car in CAD :  %.1f", monthlyCost));
    	insuranceLabel.setText(String.format("Insurance:  %.1f", insuranceCost));
    	gasPriceLabel.setText(String.format("Estimated Gas Cost:  %.1f", gasPrice));
    	
    	
    	}
    	
    	

    	
    
    @FXML
    void quarterDownCost(ActionEvent event) {
    	double costofCar = cost();
    	
    	
    	double interest= (15.0/100)*costofCar;
    	
    	
    	double half= (25.0/100)*costofCar;
    	
    	double monthly = costofCar-half;
    	double total = (monthly+interest)/24;
    	
    	CostLabel.setText(String.format("Your total cost of the car in CAD including interest :  %.1f", interest+costofCar ));
    	totalCostLabel.setText(String.format("Your total downpayment of the car in CAD "
    			+ "is  %.1f and your monthly payment for each month for the next 24 months : %.2f", half,total ));    	
    	
    	
    	
    	double insuranceCost=0;
    	double gasPrice=0;
    	
    	
    	//Insurance
    	
    	MonthlyCost i= new MonthlyCost(costofCar);
    	insuranceCost=i.getInsurance(costofCar);
    	
    	//GasPrice
    	String FuelTypeChosenGas= (String)fuelType.getValue();
    	
    	if (FuelTypeChosenGas==null) {
    		FuelTypeChosenGas="Diesel";
    	}
    	
    	MonthlyCost g=new MonthlyCost(FuelTypeChosenGas);
    	gasPrice= g.getGasPrice(FuelTypeChosenGas);
    	
    	// Total
    	double monthlyCost=insuranceCost+gasPrice;
    	//Description
    	getDescription();
    	
    	monthlyLabel.setText(String.format("Your monthly cost of the car in CAD :  %.1f", monthlyCost));
    	insuranceLabel.setText(String.format("Insurance:  %.1f", insuranceCost));
    	gasPriceLabel.setText(String.format("Estimated Gas Cost:  %.1f", gasPrice));
    	
    	
    	}
    
}