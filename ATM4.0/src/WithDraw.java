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
		System.out.println("请输入你想取出的金额");
		int amount=input.nextInt();
		
		if (this.getCurrentAccount().getBalance() >amount&&amount%100==0) {
			this.getCurrentAccount().setBalance(this.getCurrentAccount().getBalance() - amount);
			System.out.println("请取走你的钱");
			System.out.println(this.getCurrentAccount().getBalance());
			break;
		} 
		
		if (this.getCurrentAccount().getBalance() >amount&&(amount%100!=0)){
			System.out.println("您好，只能取整百的金额");
		}
		
		if (this.getCurrentAccount().getBalance() <amount){
			System.out.println("sorry,you can't afford it!!!");
		    break;
		}
	}
	}
}
