package Epam.Interest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class MainproTest {
	Mainpro mp;
	@Before
	public void objectCreation() {
		mp = new Mainpro();
	}
	@Test
	public void test() {
		assertEquals("8000.0Rs/-",mp.SimpleInterestCal(10000.00,10.00,8.00));
	}
	@Test
	public void test1() {
		assertEquals("11589.249972727881Rs/-",mp.CompoundCal(10000.00,10.00,8.00) );
	}
}
