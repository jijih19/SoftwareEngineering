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
				
				break;
			}
		}
	}

	public void add(double augend, double added) {
		double sum = augend + added;
		System.out.println("sum" +sum);
	}


}