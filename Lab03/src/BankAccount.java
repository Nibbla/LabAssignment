public class BankAccount
{ private double balance;
  public BankAccount(double balance)
  {  this.balance = balance;}
  public void deposit(double amount)
  {   balance = balance + amount; }
  public void withdraw(double amount)
  {   balance = balance - amount; }
  public double getBalance()
  {  return balance;
  }
 }
