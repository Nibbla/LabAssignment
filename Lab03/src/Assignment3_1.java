
public class Assignment3_1 {

	/**testt
	 * @param args
	 */
	public static void main(String[] args) {
		TimeDepositAccount tda = new TimeDepositAccount(3,3);
		System.out.println(tda.getBalance());
		tda.deposit(100);
		System.out.println(tda.getBalance());
		tda.addInterest();
		
		
		System.out.println(tda.getBalance());
		tda.withdraw(3);
		System.out.println(tda.getBalance());
	}

}
