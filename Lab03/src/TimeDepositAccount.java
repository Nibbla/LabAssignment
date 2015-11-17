
public class TimeDepositAccount extends SavingsAccount {

	private int maturityMonths;
	private double penalty = 5;

	public TimeDepositAccount(int interest, int majurety) {
		super(interest);
		maturityMonths = majurety;
	}
	
	public void addInterest(){
		super.addInterest();
		maturityMonths--;
	}
	
	public void withdraw(double amount){
		super.withdraw(amount);
		if (maturityMonths > 0) super.withdraw(penalty );
	}
}
