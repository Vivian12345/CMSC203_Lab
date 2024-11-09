
public class SavingsAccount extends BankAccount{
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber2;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber2 = getAccountNumber();
	}
	
	public SavingsAccount(SavingsAccount sa, double amount) {
		super(sa, amount);
		savingsNumber = sa.getSavingsNumber()+1;
		accountNumber2 = getAccountNumber();
	}
	
	public void postInterest() {
		deposit(super.getBalance()*rate*0.01/12);
	}
	
	@Override
	public String getAccountNumber() {
		return super.getAccountNumber()+"-"+savingsNumber;
	}
	
	public int getSavingsNumber() {
		return savingsNumber;
	}
}




