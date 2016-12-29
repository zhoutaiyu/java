import java.util.Scanner;

public class Deposit extends Business {
    Scanner input= new Scanner(System.in);
	// private Account currentAccount;
	Deposit(Account account) {
		super(account);
	}

	public void deposit() {
		while(true){
		System.out.println("请输入你想存的金额,输入0为退出存款功能");
		int amount=input.nextInt();
		if(amount%100==0){
		this.getCurrentAccount().setBalance(this.getCurrentAccount().getBalance() + amount);
		System.out.println("你好,你现在的余额为" + this.getCurrentAccount().getBalance());
		break;
		}
		else
			System.out.println("sorry,只能存整百的金额");
	}
	}
}
