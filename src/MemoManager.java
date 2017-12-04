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
			case 2 :
				updateMemo();
				break;
			case 3 :
				deleteMemo();
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
		System.out.println("저장되었습니다.");
	}
	
	public void updateMemo() {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < memo.size(); i++)
			System.out.println((i + 1)+". " + memo.get(i));
		System.out.println("수정하고 싶은 메모 번호를 입력하세요 : ");
		int num = scanner.nextInt();
		System.out.println("수정할 내용을 입력하세요 : ");
		String updatedString = scanner.nextLine();
		memo.set(num - 1, updatedString);
		System.out.println("수정되었습니다.");
		
	}
	public void deleteMemo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 메모 번호를 입력하세요 :");
		int num = scanner.nextInt();
		System.out.println("삭제되었습니다.");
	}
	private void printMemo() {
		System.out.println("1.Create");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.println(">>");
	}
}
