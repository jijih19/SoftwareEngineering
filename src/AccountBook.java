import java.io.*;
import java.util.*;

public class AccountBook {
   static int Accountnum = 0;
   private ArrayList<AccountData> Account = new ArrayList<AccountData>();

   public void run() throws IOException {
      Scanner scanner = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      int menu;
      
      while (true) {
         System.out.println("1.Create");
         System.out.println("2.Update");
         System.out.println("3.Delete");
         System.out.println("4.Exit");
         System.out.print(">>");

         menu = scanner.nextInt();
         switch (menu) {
         case 1:
            CreateAccount();
            break;
         case 2:
            UpdateAccount();
            break;
         case 3:
            DeleteAccount();
            break;
         case 4:
            return;

         }
      }


   }

   public void CreateAccount() {
      Scanner scanner = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      System.out.print("Date :");
      String date = scanner2.nextLine();
      System.out.print("Item :");
      String item = scanner.next();
      System.out.print("Price :");
      int price = scanner2.nextInt();

      AccountData data = new AccountData(date,item,price);
      Account.add(data);
      System.out.println("저장되었습니다.");

   }

   public void UpdateAccount() {
      Scanner scanner = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      for(int i = 0; i < Account.size(); i++){
         AccountData data = Account.get(i);
         System.out.println("Data : "+data.date + ", Item : "+data.item + ", Price : "+data.price);
      }
      System.out.print("날짜를 입력하세요 : ");
      String updatedate = scanner2.nextLine();
      for(int i = 0; i < Account.size(); i++){
         AccountData data = Account.get(i);
         if(data.date.equals(updatedate)){
            System.out.print("수정할 Date를 입력하세요 : ");
            data.date = scanner2.nextLine();
            System.out.print("수정할 Item을 입력하세요 : ");
            data.item = scanner.next();
            System.out.print("수정할 Price를 입력하세요 : ");
            data.price = scanner2.nextInt();
            System.out.println("수정되었습니다.");
         }
      }      
   }

   public void DeleteAccount() {
      Scanner scanner = new Scanner(System.in);
      AccountData deletedata;
      for(int i = 0; i < Account.size(); i++){
         AccountData data = Account.get(i);
         System.out.println("Data : "+data.date + ", Item : "+data.item + ", Price : "+data.price);
      }
      System.out.print("날짜를 입력하세요 : ");
      String deletedate = scanner.nextLine();
      for(int i = 0; i < Account.size(); i++){
         deletedata = Account.get(i);
         if(deletedata.date.equals(deletedate)){
            Account.remove(i);
            System.out.println("삭제되었습니다.");
         }
      }
   }

}

class AccountData {
   String date;
   String item;
   int price;
   AccountData(String date, String item, int price) {
      this.date = date;
      this.item = item;
      this.price = price;
   }
}