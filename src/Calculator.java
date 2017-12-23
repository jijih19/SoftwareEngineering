import java.util.*;

public class Calculator {
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.Arithmetics");
			System.out.println("2.Convert Unit");
			System.out.println("3.Exit");
			System.out.print(">>");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				arithmetics();
				break;
			case 2:
				convertUnit();
				break;
			case 3:
				return;
			}
		}
	}

	public void arithmetics() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			System.out.println("5.Exit");
			System.out.print(">>");
			
			int menu = scanner.nextInt();
			double result;
			switch (menu) {
			case 1:
				System.out.print("두 실수를 입력하세요 : ");
				double augend = scanner.nextDouble();
				double added = scanner.nextDouble();
				result = add(augend, added);
				System.out.println("result of add : " + result);
				break;
			case 2:
				System.out.print("두 실수를 입력하세요 : ");
				double minuend = scanner.nextDouble();
				double subtrahend = scanner.nextDouble();
				result = subtract(minuend, subtrahend);
				System.out.println("result of subtract : " + result);
				break;
			case 3:
				System.out.print("두 실수를 입력하세요 : ");
				double multiplier = scanner.nextDouble();
				double multiplicand = scanner.nextDouble();
				result = multiply(multiplier, multiplicand);
				System.out.println("result of multiply : " + result);
				
				break;
			case 4: 
				System.out.print("두 실수를 입력하세요 : ");
				double divisor = scanner.nextDouble();
				double dividend = scanner.nextDouble();
				divide(divisor, dividend);
				break;
			case 5:
				return;
			}
		}
	}

	public void convertUnit() {
		while (true) {
			System.out.println("1.pound -> kg");
			System.out.println("2.kg -> pound");
			System.out.println("3.inch ->  cm");
			System.out.println("4.cm -> inch");
			System.out.println("5.ferenheit -> celcius");
			System.out.println("6.celcius -> ferenheit");
			System.out.println("7.Exit");
			System.out.print(">>");

			Scanner scanner = new Scanner(System.in);
			int menu = scanner.nextInt();
			double result;
			switch (menu) {
			case 1:
				System.out.println("변환할 값을 입력하세요. :");
				double pound = scanner.nextDouble();
				result = convertPoundIntoKg(pound);
				System.out.println("pound : " + pound + " -> kg : " + result);
				break;
			case 2:
				System.out.println("변환할 값을 입력하세요. :");
				double kg = scanner.nextDouble();
				result = convertKgIntoPound(kg);
				System.out.println("kg : " + kg + "-> pound : " + result);
				break;
			case 3:
				System.out.println("변환할 값을 입력하세요. :");
				double inch = scanner.nextDouble();
				result = convertInchToCm(inch);
				System.out.println("inch : " + inch + "-> cm : " + result);
				break;
			case 4:
				System.out.println("변환할 값을 입력하세요. :");
				double cm = scanner.nextDouble();
				convertCmToInch(cm);
				break;
			case 5:
				System.out.println("변환할 값을 입력하세요. :");
				double ferenheit = scanner.nextDouble();
				result = convertFerenheitToCelcius(ferenheit);
				System.out.println("℉ : " + ferenheit + " -> ℃ : " + result);
				break;
			case 6:
				System.out.println("변환할 값을 입력하세요. :");
				double celcius = scanner.nextDouble();
				result = convertCelciusToFerenheit(celcius);
				System.out.println("℃ : " + celcius + " -> ℉ : " + result);
				break;
			case 7:
				return;
			}
		}
	}

	public double add(double augend, double added) {
		return augend + added;
	}
	
	public double subtract(double minuend, double subtrahend) { 
		return minuend - subtrahend;
	}

	public double multiply(double multiplier, double multiplicand) {
		 return multiplier * multiplicand;
	}
	
	public void divide(double divisor, double dividend) {
		if(divisor != 0) {
			double result = dividend/divisor;
			System.out.println("result of divide : " + result);
		}
		else
			System.out.println("나누는 수는 0이 될 수 없습니다.");
	}
	
	public double convertPoundIntoKg(double pound) {
		return pound * 0.453592;
	}

	public double convertKgIntoPound(double kg) {
		return 2.204622 * kg;
	}
	
	public double convertInchToCm(double inch) {
		return inch * 2.54;
	}
	
	public void convertCmToInch(double cm) {
		System.out.println("result : " + (cm * 0.39));
	}
	
	public double convertFerenheitToCelcius(double ferenheit) {
		return (ferenheit - 32) / 1.8;
	}
	
	public double convertCelciusToFerenheit(double celcius) {
		return celcius * 1.8 + 32;
	}
	
}