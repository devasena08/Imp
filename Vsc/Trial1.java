import java.util.*;
public class Trial1{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int pin =1234;
        int balance =10000;
        int nd =0;
        int nw =0;
        System.out.println("Welcome to Bank of Baroda..");
        System.out.print("Enter the pin number : ");
        int password = read.nextInt();
        if(password == pin){
            System.out.println("Hi XXX... ");
            System.out.println("Your Ac: 123456789013 ");
            while(true){
                System.out.println("Press 1 for Cash Deposit "); 
                System.out.println("Press 2 for Cash Withdraw "); 
                System.out.println("Press 3 to check balance"); 
                System.out.println("Press 4 to print receipt "); 
                System.out.println("Press 5 to Exit.. "); 

                System.out.println("Enter option : ");
                int option = read.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Enter the amount : ");
                        int deposited = read.nextInt();
                        
                        nd += deposited;
                        balance += deposited;
                        System.out.println("Available Balance is "+balance);
                        System.out.println("----------------------------------------------------");
                        break;
                    case 2 :
                        System.out.println("Enter the amount : ");
                        int Withdraw= read.nextInt();
                        
                        nw += Withdraw;
                        if(balance > Withdraw){
                            System.out.println("Successful..Print the receipt: ");
                            balance -= Withdraw;
                            System.out.println("Available Balance is "+balance);
                            System.out.println("----------------------------------------------------");
                        }else{
                            System.out.println("Insufficient balance..");
                            System.out.println("Available Balance is "+balance);
                            System.out.println("----------------------------------------------------");
                        }
                        break;
                    case 3:
                        System.out.println("Available Balance is "+balance);
                        System.out.println("----------------------------------------------------");
                        break;
                    case 4:
                        System.out.println("Receipt ...");
                        System.out.println("Hello XXX..");
                        System.out.println("Your Transaction History is : ");
                        System.out.println("Amount Deposited "+nd);
                        System.out.println("Amount Withdrawn "+nw);
                        System.out.println("Available balance "+balance);
                        System.out.println("----------------------------------------------------");
                        break;
                    case 5:
                        System.out.println("Thank You for using ATM...");
                        System.out.println("----------------------------------------------------");
                        break;
                }
            }
        }
        read.close();
    }
}