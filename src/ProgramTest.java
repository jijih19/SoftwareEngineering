import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

public class ProgramTest {

	@Test
	public void createMemoTest() {
		MemoManager mm = new MemoManager();
		mm.loadMemo();
		mm.memo.add("온유");
		assertEquals(mm.memo.get(0), "온유");
	}
	
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
	
	@Test
	public void divideTest() {
		Calculator calc = new Calculator();
		assertTrue(calc.divide(4,12) == 3);
	}
	@Test
	public void AccountTest() {
		AccountBook a = new AccountBook();
		ArrayList<AccountData> account = new ArrayList<AccountData>();
		AccountData data = new AccountData("", "", 0);
		try {
	         FileWriter file = new FileWriter("./AccountBook.txt");
	         file.write("1223 " + "책 " + 15000 + "\n");
	         data = new AccountData("1223", "책", 15000);
	         account.add(data);
	         file.close();
	      } catch (IOException e) {
	         System.out.println(e);
	      }
		try {
	        FileReader reader = new FileReader("./AccountBook.txt");
	        assertTrue(data.date == "1223");
	        reader.close();
	      } catch (FileNotFoundException error) {
		;
	} catch (IOException e ) {
		System.err.println(e);
		}
	}
}
