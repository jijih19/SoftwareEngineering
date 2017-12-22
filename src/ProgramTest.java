import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void Multiplytest() {
		Calculator calc= new Calculator();
		assertTrue(calc.multiply(7.5, 3.1) == 23.25);
	}

	@Test
	public void converPoundIntoKgtest() {
		Calculator calc= new Calculator();
		assertTrue(calc.convertPoundIntoKg(5) == 2.26796);
	}
	@Test
	public void addTest() {
		Calculator calc= new Calculator();
		assertTrue(calc.add(1.0, 2) == 3);
	}

	@Test
	public void converKgIntoPoundtest() {
		Calculator calc= new Calculator();
		assertTrue(calc.convertKgIntoPound(7) == 15.432354);
	}

}
