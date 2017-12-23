import static org.junit.Assert.*;

import org.junit.Test;

public class ProgramTest {
	
	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();
		assertTrue(calc.subtract(12, 14) == -2);
	}

	@Test
	public void multiplyTest() {
		Calculator calc = new Calculator();
		assertTrue(calc.multiply(7.5, 3.1) == 23.25);
	}

	@Test
	public void converPoundIntoKgTest() {
		Calculator calc = new Calculator();
		assertTrue(calc.convertPoundIntoKg(5) == 2.26796);
	}
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		assertTrue(calc.add(1.0, 2) == 3);
	}

	@Test
	public void converKgIntoPoundtest() {
		Calculator calc = new Calculator();
		assertTrue(calc.convertKgIntoPound(7) == 15.432354);
	}

}
