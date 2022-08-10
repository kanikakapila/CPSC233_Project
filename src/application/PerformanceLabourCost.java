package application;

public class PerformanceLabourCost extends PerformanceCost {
	PerformanceLabourCost(double x) {
		super(x);

	}
	PerformanceLabourCost(){}



	double percentageOfWage=0.25;
	
	
	
	public double CalculatePerfLabourCost(double engineCost,double fuelCost, double tireCost, double transmissionCost,double hPCost) {
		
		return getPerformanceCost(engineCost,fuelCost,tireCost,transmissionCost,hPCost)*percentageOfWage;
		
	}
}
