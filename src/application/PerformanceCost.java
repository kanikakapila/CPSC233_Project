package application;


public class PerformanceCost { 
	
	double engineSizeCost;
	double tiresCost;
	double fuelCost;
	double horsepower;
	double transmissionTypeCost;

PerformanceCost(double x){}

PerformanceCost(String x){}

PerformanceCost(double x, double y){}


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
		// From engine Size greater than 3000
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
		
		fuelCost=cost[index];
		
		return fuelCost;
		
	}
	
	double getHorsepowerCost(double x,double y) {
		double hpMultiplier=12.27;
		double hpCost=0;
		double chosenHorsepower=x;
		double chosenEngine=y;
		double maxHorsepower=500;
		double maxEngine=5000;
		
		//if Horsepower is chosen
		if (chosenHorsepower>99){
		hpCost=chosenHorsepower*hpMultiplier;
		}
		// if Horsepower is not chosen or invalid input 
		else {
			chosenHorsepower=  chosenEngine*(maxHorsepower/maxEngine); 
			hpCost=chosenHorsepower*hpMultiplier;
		}
		System.out.println("Horse " +chosenHorsepower + "Cost " + hpCost );
		return hpCost;
		
	}

	}
	
	


	
