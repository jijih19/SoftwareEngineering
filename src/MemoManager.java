import java.util.*;

public class MemoManager {
	private ArrayList<String> memo = new ArrayList<String>();

	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(true){
			printMemo();
			int menu = scanner.nextInt();
			switch(menu){
			case 1:
				createMemo();
				break;
			case 4:
				return;
			default:
				System.out.println("wrong number");
			}
		}
	}

	public void createMemo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("메모하고 싶은 내용을 입력하세요 : ");
		String newString = scanner.nextLine();
		memo.add(newString);
	}

	private void printMemo() {
		System.out.println("1.Create");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.println(">>");
	}

}
