
/**
 * Account Customer Name
• Account Type (Current, Deposit, Savings)
• BIC (Bank Identification Code)
• Account Number
• This should be unique for all objects of type BankAccount
• Balance
• Account PIN (Personal Identification Number)
 * 
 * @author Conor O Keeffe 
 * @version 23/04/15
 */
import java.util.Random;
public class Bank
{
    //Attributes
    private String Name;
    private String AccountType;
    private String BIC;
    private double Balance;
    private int AccountNumber;
    private int Pin;
    
    public Bank(){
        this.Name="Conor";
        this.AccountType="Current";
        this.BIC="";
        this.Balance=0.00;
        this.AccountNumber=000000;
        this.Pin=0000;
    }
    public Bank(String Name, String AccountType, String BIC, double Balance, int AccountNumber, int Pin){
        this.Name= Name;
        this.AccountType= AccountType;
        this.BIC= BIC;
        this.Balance= Balance;
        this.AccountNumber= AccountNumber;
        this.Pin= Pin;
    }
    
    public String getName(){
        return this.Name;
    }
        public String getAccountType(){
        return this.AccountType;
    }
        public String getBIC(){
        return this.BIC;
    }
    public double getBalance(){
        return this.Balance;
    }
        public int getAccountNumber(){
        Random ran = new Random();
		for(int i=1; i<=7; i++)
		{
			int account= ran.nextInt(9);
			System.out.print(account);
		}
        return this.AccountNumber;
    }
        public int getPin(){
        Random ran = new Random();
		for(int i=1; i<=4; i++)
		{
			int pincode = ran.nextInt(9);
			System.out.print(pincode);
		}
        return this.Pin;
    }
    
    public void setBalance (double Balance){
        this.Balance = Balance;
    }
   
    public void DisplayBankDetails(){
        String BankDetails = "Name: " + this.Name;
        BankDetails += "\nAccount Type: " + this.AccountType;
        BankDetails += "\nBIC: " + this.BIC;
        BankDetails += "\nBalance: " + this.Balance;
        BankDetails += "\nAccount Number: " + this.AccountNumber;
        BankDetails += "\nPin: " + this.Pin;
        
        System.out.println(BankDetails);
    }
}
