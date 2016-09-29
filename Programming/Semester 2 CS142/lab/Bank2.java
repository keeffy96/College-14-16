
/**
 * Write a description of class Bank2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank2
{
    public static void main (String args[])
    {
        Bank myBank = new Bank();
        System.out.println("Name: " + myBank.getName());
        System.out.println("Account Type: " + myBank.getAccountType());
        System.out.println("BIC: " + myBank.getBIC());
        System.out.println("Balance: " + "€" + myBank.getBalance());
        System.out.println("Account Number: " + myBank.getAccountNumber());
        System.out.println("My pin: " + myBank.getPin());
    }
}
