
public class Deposit extends Business {

	//private Account currentAccount;

	Deposit(Account account) {
		super(account);
	}

	public void deposit(double amount) {
		this.getCurrentAccount().setBalance(this.getCurrentAccount().getBalance() + amount);
		System.out.println("你好,你现在的余额为" + this.getCurrentAccount().getBalance());
	}
}
