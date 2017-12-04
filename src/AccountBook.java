import java.util.*;

public class AccountBook {
	static int Accountnum = 0;
	AccountData Account[] = new AccountData[100];// 입력할 수 있는 Account는 100개

	public void run() {
		Scanner scanner = new Scanner(System.in);
		int menu;
		while (true) {
			System.out.println("1.Create");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Exit");
			menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Date :");
				String date = scanner.next();
				System.out.println("Item :");
				String item = scanner.next();
				System.out.println("Price :");
				int price = scanner.nextInt();
				CreateAccount(date, item, price);
				break;
			case 2:
				System.out.println("수정할 내용의 해당 날짜를 입력하세요 : ");
				date = scanner.next();
				UpdateAccount(date);

				break;
			case 3:
				System.out.println("제거할 내용의 해당 날짜를 입력하세요 : ");
				date = scanner.next();
				DeleteAccount(date);
				break;
			case 4:
				return;

			}
		}
	}

	public void CreateAccount(String date, String item, int price) {
		if (Accountnum < 100) {
			Account[Accountnum].date = date;
			Account[Accountnum].item = item;
			Account[Accountnum].price = price;
			Accountnum++;
			System.out.println("저장되었습니다.");
		} else
			System.out.println("저장 실패하였습니다.");

	}

	public void UpdateAccount(String date) {
		for (int i = 0; i < Accountnum; i++) {
			if (Account[i].date == date) {
				System.out.print("Item :" + Account[i].item);
				System.out.print("Price :" + Account[i].price);
			}
			Scanner scanner = new Scanner(System.in);
			Account[i].date = scanner.next();
			Account[i].item = scanner.next();
			Account[i].price = scanner.nextInt();
		}

	}

	public void DeleteAccount(String date) {
		for (int i = 0; i < Accountnum; i++) {
			if (Account[i].date == date) {
				System.out.print("Item : " + Account[i].item);
				System.out.print("Price : " + Account[i].price);
				delete(i);
			}

		}

	}

	private void delete(int i) {
		for (int j = i; j < Accountnum; j++) {
			Account[i].date = Account[i + 1].date;
			Account[i].item = Account[i + 1].item;
			Account[i].price = Account[i + 1].price;
		}
		Accountnum--;
	}

	class AccountData {
		String date;
		String item;
		int price;
	}
}