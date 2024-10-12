 import java.util.*;
 class A
 {  float balance=0;
    void Deposit(int amount)
    {
        balance=balance+amount;
        System.out.printf("Deposit of Rs%.2f Succesful.\n",(float)amount);
    }
    void withdraw(int amount)
    {   
        if(balance<amount)
        {
            System.out.printf("Withdraw of Rs%.2f failed:insufficient fnds.\n",(float)amount);
        }
        else
        {
        balance=balance-amount;
        System.out.printf("Withdraw of Rs%.2f Succesful.\n",(float)amount);
        }
    }
    void check_balance()
    {
        System.out.printf("Your current balance is Rs%.2f.\n",balance);
    }
 }
 class Main 
 {
    public static void main(String[] args)
    {
      
       int choice,amount;
       A a=new A();
       System.out.println("Welcome to Banking System");

       while(true)
       {
        System.out.println("What would you like to do?");
        System.out.println("1.Deposit\n2.Withdrawl\n3.Check Balance\n4.Quit");
        System.out.println("enter your choice");
        Scanner sc=new Scanner(System.in);
        choice =sc.nextInt();
        


        switch(choice)
        {  
            case 1:
                System.out.println("enter amount to deposit");
                 amount=sc.nextInt();
                a.Deposit(amount);
                 break;
            case 2:
                System.out.println("enter amount to withdraw");
                 amount=sc.nextInt();
                a. withdraw(amount);
                 break;
            case 3:
            a.check_balance();
            break;
            case 4:
            System.out.println("Thank you for using the bnking System.\n");
            sc.close();
           default:
           System.out.println("Invalid Choice,Please try again.\n");

        }
       }
    
    }
    
}
