public class ModPassword extends Business{
	//private Account currentAccount;
	
	ModPassword(Account account) {
		super(account);
	}


	public void modify(String password){
		this.getCurrentAccount().setPassword(password);
		System.out.println("ÃÜÂëĞŞ¸Ä³É¹¦");
	}
}
