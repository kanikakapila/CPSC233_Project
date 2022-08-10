package application;

public class AppearanceLabourCost extends AppearanceCost {
	AppearanceLabourCost(double d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	AppearanceLabourCost(){};


	double percentageOfWage=.20;


public double CalculateAppLabourCost(double colour,double type, double seat, double lights,double safety) {
	
	return TotalAppearanceCost(colour,type,seat,lights,safety)*percentageOfWage;
	
}




}