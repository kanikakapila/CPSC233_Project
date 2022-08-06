package application;

public class MonthlyCost  {


public MonthlyCost(double x){}
	

public MonthlyCost(String x) {}


double getInsurance(double x) {

	

	double insuranceCost=0;
	if (x<15000) {
		insuranceCost=100;
	}else if(x>=15000 && x<=25000) {
		insuranceCost=110;
	}
	else {
		insuranceCost=130;
	}
	
	return insuranceCost;


}


public double getGasPrice(String x) {
	double gasPrice=0;
	
	if (x.equals("Electric")) {
		gasPrice=0;
	}
	else {
		gasPrice=160;
		// Value taken from: https://www.finder.com/ca/cost-of-car-ownership
	}

	
	return gasPrice;
}

}