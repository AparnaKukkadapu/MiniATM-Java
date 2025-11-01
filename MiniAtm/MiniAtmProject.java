import java.util.Scanner;

class MiniAtmProject {
     
        
     void displayBalance(int balance)
     {
         System.out.println("Balance amount is " +balance);
     }
     int withdraw(int balance, int withdraw)
     {
         balance=balance-withdraw;
         return balance;
     }
       int deposit(int balance, int deposit)
     {
         balance=balance+deposit;
         return balance;
     }
 
    public static void main(String[] args) {
               
             MiniAtmProject miniatm=new MiniAtmProject();
              Scanner scanner=new Scanner(System.in);
        int balance=10000;
        int withdraw=0;
        int deposit=0;
        System.out.println("Welcome to MiniAtm");
        while(true)
        {
      System.out.println("Choose one from the below options");
      System.out.println("1. Check balance");
      System.out.println("2. Withdraw amount");
      System.out.println("3. Deposit amount");
      System.out.println("4. Exit");
      int option = scanner.nextInt();

      if(option==4)
      {
           System.out.println("Thank you for using MiniATM. Goodbye!");
        break;
      }
        
      switch(option)
      {
        case 1:
            {
                 miniatm.displayBalance(balance);
                break;
            }
        case 2:
            {
             System.out.println("Enter withdraw amount ");
             withdraw=scanner.nextInt();
             if(withdraw>balance)
             {
                 System.out.println("Insufficient funds");
             }
             else
             {
             balance=miniatm.withdraw(balance,withdraw);
            miniatm.displayBalance(balance);
             }
             break;
            }
             case 3:
            {
            System.out.println("Enter deposit amount ");
             deposit=scanner.nextInt();
             if(deposit<=0)
             {
                 System.out.println("Enter valid amount");
             }
             else
             {
             balance=miniatm.deposit(balance,deposit);
            miniatm.displayBalance(balance);
             }
             break;
            }
           
                default:
                {
                    System.out.println("Enter a valid number");
                }
      }
  
    }
}
}