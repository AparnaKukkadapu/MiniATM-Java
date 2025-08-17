import java.util.Scanner;

class MiniAtmProject {
    public static void main(String[] args) {
               
        int balance=10000;
       
        System.out.println("Welcome to MiniAtm");
        Scanner scanner=new Scanner(System.in);         
       
      
            while(true)
            {
      System.out.println("Choose one from the below options");
      System.out.println("1. Check balance");
      System.out.println("2. Deposit amount");
      System.out.println("3. Withdraw amount");
      System.out.println("4. Exit");
      
      int option = scanner.nextInt();
      if(option==4)
      {
        break;
      }
        
     switch(option)
     {
        case 1:
        {
            System.out.println("Balance in the account is " +balance);
            break;
        }

         case 2:
        {
            System.out.println("Enter the amount you want to deposit");
            
            int depositbalance=scanner.nextInt();
                 if(depositbalance<=0)
            {
                System.out.println("Enter valid amount");
                break;
            }
            balance=balance+depositbalance;
       
            System.out.println("After deposit the balance is " +balance);
            break;
        }
           case 3:
        {
            System.out.println("Enter the amount you want to withdraw");
            
            int withdrawbalance=scanner.nextInt();
            if(withdrawbalance<=0)
            {
                System.out.println("Enter valid amount");
                break;
            }
            if(withdrawbalance>balance)
            {
                System.out.println("insufficient funds");
                break;
            }
            balance=balance-withdrawbalance;
            System.out.println("After withdrawal the balance is " +balance);
            break;
        }
            case 4:
        {
           break;
        }
        default:
        {
            System.out.println("Enter a valid number please");
        }
     }
       
        
       }
    }

}