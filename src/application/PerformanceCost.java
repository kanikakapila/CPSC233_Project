package application;


public class PerformanceCost { 
	
	double engineSizeCost;
	double tiresCost;
	double fuelCost;
	double horsepower;
	double transmissionTypeCost;

PerformanceCost(double x){}

PerformanceCost(String x){}


PerformanceCost( double costOfEngine,double  costOfTires, double costOfFuel,  
		double horseCost, double costOfTransmission ){
		engineSizeCost = costOfEngine; 
		tiresCost = costOfTires;
		fuelCost = costOfFuel;
		horsepower = horseCost;
		transmissionTypeCost = costOfTransmission; 
		}

	
 // Gets total Cost
	double getPerformanceCost() {
		return engineSizeCost + tiresCost + fuelCost + horsepower + transmissionTypeCost;
	}
	
	
	double getEngineCost(double x) {
		 engineSizeCost=0;
		//For engine size 1000-3000
		double ecost1 = 2.5;
		// Froe enfine Size greater than 3000
		double ecost2=  1.75;
		
		if(x<=3000) {
			engineSizeCost = x*ecost1;
			}
		else {
			engineSizeCost = (x-3000)*ecost2 + 3000*ecost1;
		}
		
		return engineSizeCost;
		
	}
	
	double getFuelCost(String x) {
		fuelCost=0;
		
		String[] fuelTypes = {"Diesel", "Petrol", "Electric", "Hybrid"};
		int[] cost = {1350, 1400, 2500,1600 };
		int index=0;
		
		for (int i=0;i<fuelTypes.length;i++) {
			if(fuelTypes[i].equals(x)) {
			index=i;
		}
		}
		System.out.println(x);
		fuelCost=cost[index];
		System.out.println("Fuel Cost"+ fuelCost);
		
		return fuelCost;
		
	}
	

}
	
