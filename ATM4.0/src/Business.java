
//ҵ���࣬�Ǹ���ҵ������࣬���е�ǰҵ����˻�
public class Business {
	private Account currentAccount=null;

	Business(){
	}
	
	Business(Account account){
		this.currentAccount=account;
	}
	

	public Account getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(Account currentAccount) {
		this.currentAccount = currentAccount;
	}
}