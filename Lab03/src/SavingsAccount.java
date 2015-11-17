public class SavingsAccount extends BankAccount
{ private double interestRate;

  public SavingsAccount(double rate) 
   { 
	  super(0);
	  interestRate = rate;
   }
   public void addInterest() 
   {  double interest = getBalance() 
		* interestRate / 100;
      deposit(interest); 
   }   
}
