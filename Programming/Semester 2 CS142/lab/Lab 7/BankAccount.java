import java.util.Scanner;

public class BankAccount
{
    private String customerName;
    private char accountType;
    private int BIC;
    private int accountNo;
    private double balance;
    private int PIN;
    
    private static int lastAccountNumber = 00000000;
    
    public BankAccount()
    {
        this.customerName = "John Smyth";
        this.accountType = 'C';
        this.accountNo = lastAccountNumber++;
        this.BIC = 123 + accountNo;
        this.balance = 100;
        this.PIN = 0000;
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        BankAccount account = new BankAccount();
        boolean finished = false;
        
        while(finished == false)
        {
            System.out.println("\nWhat would you like to do:\n1) Lodge Money\n2) Withdraw Money\n3) Check Balance\n4) Change PIN\n5) Finish");
            option = scan.nextInt();
            if(option==1)
            {
                System.out.println("How much would you like to lodge?");
                double amount = scan.nextDouble();
                double newAmount = amount + account.getBalance();
                account.setBalance(newAmount);
            }
            else if(option==2)
            {
                System.out.print("Please enter your PIN:");
                int inputPIN = scan.nextInt();
                if(inputPIN == account.getPIN())
                {
                    System.out.println("How much would you like to withdraw?");
                    double amount = scan.nextDouble();
                    double newAmount = account.getBalance() - amount;
                    account.setBalance(newAmount);
                }
                else
                {
                    System.out.println("This is not the right PIN.");
                }
            }
            else if(option==3)
            {
                System.out.print("Please enter your PIN:");
                int inputPIN = scan.nextInt();
                if(inputPIN == account.getPIN())
                {
                    System.out.println("Your balance is " +account.getBalance());
                }
                else
                {
                    System.out.println("This is not the right PIN.");
                }
            }
            else if(option==4)
            {
                System.out.print("Please enter your PIN:");
                int inputPIN = scan.nextInt();
                if(inputPIN == account.getPIN())
                {
                    System.out.println("Please enter your new PIN");
                    int newPIN = scan.nextInt();
                    account.PIN = newPIN;
                }
                else
                {
                    System.out.println("This is not the right PIN.");
                }
            }
            else if(option==5)
            {
                finished = true;
            }
            else
            {
                System.out.println("That is not a valid option.");
            }
        }
    }
    
    public double getBalance()
    {
        return this.balance;
    }
    
    public void setBalance(Double newBal)
    {
        this.balance = newBal;   
    }
    
    public int getPIN()
    {
        return this.PIN;
    }
    
    public void setPIN(int newPIN)
    {
        this.PIN = newPIN;   
    }
}
