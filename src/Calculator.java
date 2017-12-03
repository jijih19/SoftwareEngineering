﻿import java.util.*;

public class Calculator {
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.Arithmetics");
			System.out.println("2.Convert Unit");
			System.out.println("3.Exit");
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
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				double augend = scanner.nextDouble();
				double added = scanner.nextDouble();
				add(augend, added);
				break;
			case 2:
				System.out.print("두 실수를 입력하세요 : ");
				double minuend = scanner.nextDouble();
				double subtrahend = scanner.nextDouble();
				subtract(minuend, subtrahend);
				break;
			case 3:
				double multiplier = scanner.nextDouble();
				double multiplicand = scanner.nextDouble();
				multiply(multiplier, multiplicand);
				break;
			case 4: 
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

			Scanner scanner = new Scanner(System.in);
			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				double pound = scanner.nextDouble();
				convertPoundIntoKg(pound);
				break;
			case 2:
				double kg = scanner.nextDouble();
				convertKgIntoPound(kg);
				break;
			case 3:
				System.out.println("변환할 값을 입력하세요. :");
				double inch = scanner.nextDouble();
				convertInchToCm(inch);
				break;
			case 4:
				double cm = scanner.nextDouble();
				convertCmtoInch(cm);
				break;
			case 5:
				double ferenheit = scanner.nextDouble();
				convertFerenheitToCelcius(ferenheit);
				break;
			case 6:
				System.out.println("변환할 값을 입력하세요. :");
				double celcius = scanner.nextDouble();
				convertCelciusToFerenheit(celcius);
				break;
			case 7:
				return;
			}
		}
	}

	public void add(double augend, double added) {
		double sum = augend + added;
		System.out.println("sum" + sum);
	}
	
	public void subtract(double minuend, double subtrahend) { 
		System.out.println("result : " + (minuend - subtrahend));
	}

	public void multiply(double multiplier, double multiplicand) {
		double result = multiplier * multiplicand;
		System.out.println("result of multiply : " + result);
	}
	public void divide(double divisor, double dividend) {
		if(divisor != 0) {
			double result = dividend/divisor;
			System.out.println("result of divide : " + result);
		}
		else
			System.out.println("나누는 수는 0이 될 수 없습니다."));
	}
	public void convertPoundIntoKg(double pound) {
		double result = pound * 0.453592;
		System.out.println("pound : " + pound + " -> kg : " + result);
	}

	public void convertKgIntoPound(double kg) {
		double pound = 2.20462262 * kg;
		System.out.println("kg -> pound" + pound);

	}
	
	public void convertInchToCm(double inch) {
		System.out.println("result : " + (inch * 2.54))
	}
	
	public void convertCmToInch(double cm) {
		System.out.println("result : " + (cm * 0.39))
	}
	
	public void convertFerenheitToCelcius(double ferenheit) {
		double result = (ferenheit - 32) / 1.8;
		System.out.println("℉ : " + ferenheit + " -> ℃ : " + result);
	}
	
	public void convertCelciusToFerenheit(double celcius) {
		System.out.println("result : " + (celcius * 1.8 + 32))
	}
	
}