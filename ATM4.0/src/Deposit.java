import java.util.Scanner;

public class Deposit extends Business {
    Scanner input= new Scanner(System.in);
	// private Account currentAccount;
	Deposit(Account account) {
		super(account);
	}

	public void deposit() {
		while(true){
		System.out.println("�����������Ľ��,����0Ϊ�˳�����");
		int amount=input.nextInt();
		if(amount%100==0){
		this.getCurrentAccount().setBalance(this.getCurrentAccount().getBalance() + amount);
		System.out.println("���,�����ڵ����Ϊ" + this.getCurrentAccount().getBalance());
		break;
		}
		else
			System.out.println("sorry,ֻ�ܴ����ٵĽ��");
	}
	}
}
