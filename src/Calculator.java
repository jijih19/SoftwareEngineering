import java.util.*;

public class Calculator {
	public void run(){
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.Arithmetics");
			System.out.println("2.Convert Unit");
			System.out.println("3.Exit");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1:
				arithmetics();
				break;
			case 2:
				convertUnit();
				break;
			case 3 :
				return;
			}
		}
	}

	public void arithmetics() {
		while(true) {
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4. Divide");
			System.out.println("5.Exit");

			Scanner scanner = new Scanner(System.in);
			int menu = scanner.nextInt();

			switch(menu) {
			case 1: 
				double augend = scanner.nextDouble();
				double added = scanner.nextDouble();
				add(augend,added);
				break;
			case 2: 
				break;
			case 3:
				double multiplier = scanner.nextDouble();
				double multiplicand = scanner.nextDouble();
				multiply(multiplier,multiplicand);
				break;
			case 4:
				break;
			case 5:
				return;
			}
		}
	}

	public void convertUnit() {
		while(true) {
			System.out.println("1.pound -> kg");
			System.out.println("2.kg -> pound");
			System.out.println("3.inch ->  cm");
			System.out.println("4.cm -> inch");
			System.out.println("5.¡ÆF -> ¡ÆC");
			System.out.println("6.¡ÆC -> ¡ÆF");
			System.out.println("7.Exit");

			Scanner scanner = new Scanner(System.in);
			int menu = scanner.nextInt();

			switch(menu) {
			case 1: 
				double pound = scanner.nextDouble();
				convertPoundIntoKg(pound);
				break;
			case 2: 
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				double ferenheit = scanner.nextDouble();
				convertFerenheitToCelcius(ferenheit);
				break;
			case 6:
				
				break;
			case 7:
				return;

			}
		}
	} 
	
	public void add(double augend, double added) {
		double sum = augend + added;
		System.out.println("sum" +sum);
	}
	
	public void multiply(double multiplier,double multiplicand) {
		double result = multiplier * multiplicand;
		System.out.println("result of multiply : "+result);
	}
	
	public void convertPoundIntoKg(double pound) {
		double result = pound * 0.453592;
		System.out.println("pound : " + pound + " -> kg : " + result);
	}

	public void convertFerenheitToCelcius(double ferenheit) {
		double result = (ferenheit-32) / 1.8;
		System.out.println("¡ÆF : " + ferenheit + " -> ¡ÆC : " + result);
	}
}