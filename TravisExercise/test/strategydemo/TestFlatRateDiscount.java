package strategydemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestFlatRateDiscount {

	@Test
	public void test() {
		FlatRateDiscountStrategy f = new FlatRateDiscountStrategy(5);
		float i = f.applyDiscount(100);
		float a = 95;
		assertEquals(a, i, 1);	
	}

}
