package Epam.Interest;

import java.util.Scanner;
public class Mainpro {
	double principle;
	double rateOfInterest;
	double noOfYears;
	Scanner scanner = new Scanner(System.in);
	Mainpro(){}
	public String SimpleInterestCal(double principle, double noOfYears, double rateOfInterest) {
		Simple s = new Simple();
		return String.valueOf(s.sim(principle,noOfYears,rateOfInterest))+"Rs/-";
	}
	public String CompoundCal(double principle, double noOfYears, double rateOfInterest) {
		Compound c = new Compound();
		return String.valueOf(c.comp(principle,noOfYears,rateOfInterest))+"Rs/-";
	}
	public static void main(String args[]) {
	
}
}
