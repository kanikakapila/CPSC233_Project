
package application;

public class AppearanceCost  {
	double colourCost;
	double carTypeCost;
	double seatCost;
	double lightsCost;
	double safetyCost;



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
}
