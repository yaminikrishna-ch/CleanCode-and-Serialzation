package Epam.Interest;

public class Compound {
	double comp(double p ,double n, double r) {
		double com= p*( Math.pow((1+(r/100)),n));
		return com - p;
	}
}
