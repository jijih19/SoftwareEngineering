import java.io.*;
import java.util.*;

public class MemoManager {
	public ArrayList<String> memo = new ArrayList<String>();

	public void run() {
		Scanner scanner = new Scanner(System.in);
		loadMemo();
		while (true) {
			printMemo();
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				createMemo();
				break;
			case 2:
				updateMemo();
				break;
			case 3:
				deleteMemo();
				break;
			case 4:
				saveMemo();
				return;
			default:
				System.out.println("wrong number");
			}
		}
	}

	public void createMemo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("메모하고 싶은 내용을 입력하세요 : ");
		String newString = scanner.nextLine();
		memo.add(newString);
		System.out.println("저장되었습니다.");
	}

	public void updateMemo() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		for (int i = 0; i < memo.size(); i++)
			System.out.println((i + 1) + ". " + memo.get(i));
		System.out.print("수정하고 싶은 메모 번호를 입력하세요 : ");
		int num = scanner.nextInt();
		System.out.print("수정할 내용을 입력하세요 : \n>>");
		String updatedString = scanner2.nextLine();
		memo.set(num - 1, updatedString);
		System.out.println("수정되었습니다.");

	}

	public void deleteMemo() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < memo.size(); i++)
			System.out.println((i + 1) + ". " + memo.get(i));
		System.out.print("삭제할 메모 번호를 입력하세요 :");
		int num = scanner.nextInt();
		memo.remove(num - 1);
		System.out.println("삭제되었습니다.");
	}

	public void saveMemo() {
		deleteAndMakeFile();
		writeMemo();
	}

	private void writeMemo() {
		try {
			FileWriter file = new FileWriter("./memo.txt");
			for (String m : memo) {
				file.write(m + "\n");
			}
			file.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private void deleteAndMakeFile() {
		File file = new File("./memo.txt");
		if (file.exists()) {
			file.delete();
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void loadMemo() {
		try {
			if (memo.size() == 0) {
				FileReader reader = new FileReader("./memo.txt");
				int ch;
				String str = "";
				while ((ch = reader.read()) != -1) {
					if ((char) ch == '\n') {
						memo.add(str);
						str = "";
					} else
						str += (char) ch;
				}
				reader.close();
			}
		} catch (FileNotFoundException error) {
			;
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	private void printMemo() {
		System.out.println("[MemoManager]");
		System.out.println("1.Create");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Exit");
		System.out.print(">>");
	}
}