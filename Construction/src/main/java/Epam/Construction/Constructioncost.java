package Epam.Construction;

public class Constructioncost {
	Constructioncost(){
	}
	public String CostOfConstruction(String material, double area) throws Exception{
		if(material.equals("Standard")) {
			Standard s = new Standard();
			return String.valueOf(s.getRate() * area)+"Rs/-";
		}
		else if(material.equals("AboveStandard")) {
			AboveStandard as = new AboveStandard();
			return String.valueOf(as.getRate() * area)+"Rs/-";
		}
		else if(material.equals("HighStandard")) {
			HighStandard hs = new HighStandard();
			return String.valueOf(hs.getRate() * area)+"Rs/-";
		}
		else if(material.equals("HighStandardFullAutomatic")) {
			HighStandardFullAutomatic hsfa = new HighStandardFullAutomatic();
			return String.valueOf(hsfa.getRate() * area)+"Rs/-";
		}
		else {
			throw new Exception("this Automation is Not Possible");
		}
	}
}
