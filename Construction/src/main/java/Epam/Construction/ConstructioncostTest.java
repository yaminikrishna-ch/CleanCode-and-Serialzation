package Epam.Construction;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ConstructioncostTest {
	Constructioncost con;
	@Before
	public void objectCreation() {
		con = new Constructioncost();
	}
	//@SuppressWarnings("deprecation")
	@Test
	public void test() throws Exception{
		assertEquals("36000.0Rs/-",con.CostOfConstruction("Standard",30.0));
	}
	public void test1() throws Exception{
		assertEquals("1634400.0Rs/-", con.CostOfConstruction("HighStandard",908.0));
	}
	public void test2() throws Exception{
		assertEquals("1110000.0Rs/-",con.CostOfConstruction("HighStandardFullAutomatic",444.0));
	}
	public void test3() throws Exception{
		assertEquals("1065600.0Rs/-", con.CostOfConstruction("AboveStandard",888.0));
	}
}
