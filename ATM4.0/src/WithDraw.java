import java.util.Scanner;

public class WithDraw extends Business {
	//private Account currentAccount;
	Scanner input= new Scanner(System.in);
	WithDraw(Account account) {
		//at java.util.Scanner.throwFor(Unknown Source)
		//this.currentAccount=account;
		//Exception in thread "main" java.lang.NullPointerException
		super(account);
	}

	public void withDraw() {
		while(true){
		System.out.println("����������ȡ���Ľ��");
		int amount=input.nextInt();
		
		if (this.getCurrentAccount().getBalance() >amount&&amount%100==0) {
			this.getCurrentAccount().setBalance(this.getCurrentAccount().getBalance() - amount);
			System.out.println("��ȡ�����Ǯ");
			System.out.println(this.getCurrentAccount().getBalance());
			break;
		} 
		
		if (this.getCurrentAccount().getBalance() >amount&&(amount%100!=0)){
			System.out.println("���ã�ֻ��ȡ���ٵĽ��");
		}
		
		if (this.getCurrentAccount().getBalance() <amount){
			System.out.println("sorry,you can't afford it!!!");
		    break;
		}
	}
	}
}
