import java.io.*;
import java.util.*;

public class AccountBook {
   static int accountNum = 0;
   private ArrayList<AccountData> account = new ArrayList<AccountData>();

   public void run() throws IOException {
      Scanner scanner = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      int menu;
      loadAccount();
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
            saveAccountBook();
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

      AccountData data = new AccountData(date, item, price);
      account.add(data);
      System.out.println("저장되었습니다.");

   }

   public void UpdateAccount() {
      Scanner scanner = new Scanner(System.in);
      Scanner scanner2 = new Scanner(System.in);
      for (int i = 0; i < account.size(); i++) {
         AccountData data = account.get(i);
         System.out.println("Data : " + data.date + ", Item : " + data.item + ", Price : " + data.price);
      }
      System.out.print("날짜를 입력하세요 : ");
      String updatedate = scanner2.nextLine();
      for (int i = 0; i < account.size(); i++) {
         AccountData data = account.get(i);
         if (data.date.equals(updatedate)) {
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
      for (int i = 0; i < account.size(); i++) {
         AccountData data = account.get(i);
         System.out.println("Data : " + data.date + ", Item : " + data.item + ", Price : " + data.price);
      }
      System.out.print("날짜를 입력하세요 : ");
      String deletedate = scanner.nextLine();
      for (int i = 0; i < account.size(); i++) {
         deletedata = account.get(i);
         if (deletedata.date.equals(deletedate)) {
            account.remove(i);
            System.out.println("삭제되었습니다.");
         }
      }
   }

   public void saveAccountBook() {
      deleteAndMakeFile();
      writeMemo();
   }

   private void writeMemo() {
      try {
         FileWriter file = new FileWriter("./AccountBook.txt");
         for (AccountData m : account) {
            file.write(m.date + " " + m.item + " " + m.price + "\n");
         }
         file.close();
      } catch (IOException e) {
         System.out.println(e);
      }
   }

   private void deleteAndMakeFile() {
      File file = new File("./AccountBook.txt");
      if (file.exists()) {
         file.delete();
      }
      try {
         file.createNewFile();
      } catch (IOException e) {
         System.out.println(e);
      }
   }

   public void loadAccount() {
      try {
         if (account.size() == 0) {
            FileReader reader = new FileReader("./AccountBook.txt");
            int ch;
            int sep = 0;
            String date = "", item = "";
            int price = 0;
            while ((ch = reader.read()) != -1) {
               if ((char) ch == '\n') {
                  account.add(new AccountData(date, item, price));
                  date = item = "";
                  price = 0;
                  sep = 0;
               } else {
                  if ((char) ch == ' ')
                     sep++;
                  if (sep == 0)
                     date += (char) ch;
                  else if (sep == 1)
                     item += (char) ch;
                  else
                     price += ch;
               }
            }
            reader.close();
         }
      } catch (FileNotFoundException error) {
         ;
      } catch (IOException e) {
         System.err.println(e);
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