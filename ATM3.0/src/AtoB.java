
public class AtoB extends Business {
	
	AtoB(Account account) {
		super(account);
	}
	
	public void aTOb(double amount,Account a){
		if (this.getCurrentAccount().getBalance() >amount) {
			this.getCurrentAccount().setBalance(this.getCurrentAccount().getBalance() - amount);
			a.setBalance(a.getBalance()+amount);
			System.out.println("ת�˳ɹ�");
		} else
			System.out.println("sorry,you can't afford it!!!");
	}
		
		
	}
	
