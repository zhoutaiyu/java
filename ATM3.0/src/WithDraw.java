
public class WithDraw extends Business {
	//private Account currentAccount;

	WithDraw(Account account) {
		//at java.util.Scanner.throwFor(Unknown Source)
		//this.currentAccount=account;
		//Exception in thread "main" java.lang.NullPointerException
		super(account);
	}

	public void withDraw(double amount) {
		if (this.getCurrentAccount().getBalance() >amount) {
			this.getCurrentAccount().setBalance(this.getCurrentAccount().getBalance() - amount);
			System.out.println("��ȡ�����Ǯ");
			System.out.println(this.getCurrentAccount().getBalance());
		} else
			System.out.println("sorry,you can't afford it!!!");
	}
}
