import java.util.*;

public class AccountBook {
   static int Accountnum = 0;
   AccountData Account[] = new AccountData[100];//입력할 수 있는 Account는 100개
   public void run(){
      Scanner scanner = new Scanner(System.in);
      int menu;
      while(true){
         System.out.println("1. Create");
         System.out.println("2. Update");
         System.out.println("3. Delete");
         System.out.println("4. Exit");
         menu = scanner.nextInt();
         switch(menu){
         case 1:
            
         case 2:
        	
            System.out.println("날짜를 입력하세요 : ");
            String date = scanner.next();
            UpdateAccount(date);

            break;
         case 3:
            //DeleteAccount();
            break;
         case 4:
            return;

         }
      }
   }

   public void UpdateAccount(String date) {
      for(int i=0; i<Accountnum; i++) {
         if(Account[i].date == date) {
            System.out.print("Item :" + Account[i].item);
            System.out.print("price" + Account[i].price);
         }
         Scanner scanner = new Scanner(System.in);
         Account[i].date = scanner.next();
         Account[i].item = scanner.next();
         Account[i].price = scanner.nextInt();
      }

   }
   public void DeleteAccount(String date) {
      for(int i=0; i<Accountnum; i++) {
         if(Account[i].date == date) {
            System.out.print("Item : " + Account[i].item);
            System.out.print("price" + Account[i].price);
            delete(i);
         }
         
         
      }
   
   }

   private void delete(int i) {
      for(int j=i; j<Accountnum; j++) {
         Account[i].date = Account[i+1].date;
         Account[i].item = Account[i+1].item;
         Account[i].price =Account[i+1].price;
      }
      Accountnum--;
   }

   class AccountData {
      String date;
      String item;
      int price;
   }
}