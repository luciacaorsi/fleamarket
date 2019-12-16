package en.arvato.fleamarket;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;

public class OptimalFleaCalculatorTest {

	@Test
	public void testGetOptimalValue() {

		Flea flea1 = new Flea("flea1", 50.0f, 10);
		Flea flea2 = new Flea("flea2", 50.0f, 10);

		Flea flea3 = new Flea("flea3", 100.0f, 10);

		Set<Flea> fleas = Set.of(flea1, flea2, flea3);

		int val = OptimalFleaCalculator.getOptimalValue(100.0f, fleas);
		assertEquals(20, val);
	}
}