
package application;

public class AppearanceCost  {
	double colourCost;
	double carTypeCost; 
	double seatCost;
	double lightsCost;
	double safetyCost;

AppearanceCost(String x){ 
	}  
AppearanceCost(double d){
}




	AppearanceCost(double colour,double type, double seat, double lights,double safety){
		colourCost=colour;
		carTypeCost=type;
		seatCost=seat;
		lightsCost=lights;
		safetyCost=safety;
	} 
	
	double TotalAppearanceCost() {
		return colourCost+carTypeCost+seatCost+lightsCost+safetyCost;



} 
	double getCarTypeCost (String x) { 
		carTypeCost = 0;
		String [] carTypes = {"Sedan","SUV","Van","Hatchback","Limousine","Truck","Sports Car"}; 
		int [] cost = {2500,3500,3300,1700,4000,4500,5000}; 
		int index = 0; 
		
		for(int i=0;i<carTypes.length;i++) { 
			if (carTypes[i].equals(x)) {
				index = i;
			}
			
		}
		carTypeCost = cost[index]; 
		
		
		return carTypeCost;
		
	}   
	double getSeatCost (double d) { 
		int averageSeatPrice = 212;
		double seatCost = 0; 
		seatCost = d*averageSeatPrice;
		return seatCost; 
		
		
	}
	double getLightsCost(String x) {  
		lightsCost = 0;
		String [] lightTypes = {"Head Lights", "Tail Lights", "Signal Lights", "Hazard Lights",
				"Fog Lights", "Daytime Running Lights"};
		
		int cost[]= {200,438,150,60,150,50}; 
		int index = 0;
		for(int i=0;i<lightTypes.length;i++) { 
			if (lightTypes[i].equals(x)) {
			index = i;
		}
		}
		lightsCost = cost[index];
		return lightsCost;
		
	}
	
	
}
