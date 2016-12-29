import java.util.Scanner;

public class AtoB extends Business {
	Scanner input= new Scanner(System.in);
	
	AtoB(Account account) {
		super(account);
	}
	
	public void aTOb(){
		System.out.println("请输入被转账用户账号");
		String s = input.next();
		Account a;
		while(true){
		if ((a = new Query().query(s)) != null&&(this.getCurrentAccount().getID().equals(s)==false)) {
			System.out.println("请输入金额");
			int amount = input.nextInt();
		if (this.getCurrentAccount().getBalance() >=amount&&(amount%100==0)) {
			this.getCurrentAccount().setBalance(this.getCurrentAccount().getBalance() - amount);
			a.setBalance(a.getBalance()+amount);
			System.out.println("转账成功");
			break;
		}
		if(this.getCurrentAccount().getBalance() <amount&&(amount%100==0))
			System.out.println("sorry,you can't afford it!!!");
		if(amount%100!=0)
			System.out.println("只能转账为100的整数倍的金额");
	}
		}
	}
}
	
