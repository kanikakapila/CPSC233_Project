package application;

public class PerformanceLabourCost extends PerformanceCost {
	PerformanceLabourCost(double x) {
		super(x);
		// TODO Auto-generated constructor stub
	}
	PerformanceLabourCost(){}



	double percentageOfWage=0.25;
	
	
	
	public double CalculatePerfLabourCost() {
		
		return getPerformanceCost()*percentageOfWage;
		
	}
}
