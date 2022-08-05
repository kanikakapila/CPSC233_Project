package application;

public class PriceAlgorithms {  
	
	
	private String E;
	private String fuelMethod;
	private String numOfSeats; 
	private String carType;
	private String addLights;
	
	 
	
	
	public double costOfEngine(double E) {  
		double engineCost=0;
		// Engine multiplier
		double eCost=1.08;
		
		
		while(E>=1000) {
    		if (E<2500) {
    			engineCost+= (E)*eCost;
    			break;
    		}
    		else {
    			engineCost+= (E*(eCost+1));
    			break;
    		}
    		}
		
	
		return engineCost;
		
	} 
	public double costOfFuel (String fuelMethod) {
		return 0;
		
		
	} 
	public double costOfSeats(String numOfSeats) {
		return 0;
		
	} 
	public double costOfCarType(String carType) {
		return 0;
	}
	public double costOfLights(String addLights) {
		return 0;
		
	}
	
	
}
