import java.io.IOException;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		MemoManager memo = new MemoManager();
		Calculator calculator = new Calculator();
		AccountBook accountbook = new AccountBook();
		
		while(true){
			System.out.println("1.Memo Manager");
			System.out.println("2.Calculator");
			System.out.println("3.Account book");
			System.out.println("4.Exit");
			System.out.print(">>");
			
			int menu = scanner.nextInt();
			switch(menu){
			case 1:
				memo.run();
				break;
			case 2 :
				calculator.run();
				break;
			case 3 :
				accountbook.run();
				break;
			case 4:
				return;
			default:
				System.out.println("wrong number");
			}
		}
	}

}
