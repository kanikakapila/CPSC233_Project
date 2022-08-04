package application;


public class PerformanceCost { 
	
	double engineSizeCost;
	double tiresCost;
	double fuelCost;
	double horsepower;
	double transmissionTypeCost;



PerformanceCost( double costOfEngine,double  costOfTires, double costOfFuel,  
		double horseCost, double costOfTransmission ){
		engineSizeCost = costOfEngine; 
		tiresCost = costOfTires;
		fuelCost = costOfFuel;
		horsepower = horseCost;
		transmissionTypeCost = costOfTransmission; 
		}

	

	double getPerformanceCost() {
		return engineSizeCost + tiresCost + fuelCost + horsepower + transmissionTypeCost;
	}
	
	


}
	
