import java.util.Scanner;

public class AtoB extends Business {
	Scanner input= new Scanner(System.in);
	
	AtoB(Account account) {
		super(account);
	}
	
	public void aTOb(){
		System.out.println("�����뱻ת���û��˺�");
		String s = input.next();
		Account a;
		while(true){
		if ((a = new Query().query(s)) != null&&(this.getCurrentAccount().getID().equals(s)==false)) {
			System.out.println("��������");
			int amount = input.nextInt();
		if (this.getCurrentAccount().getBalance() >=amount&&(amount%100==0)) {
			this.getCurrentAccount().setBalance(this.getCurrentAccount().getBalance() - amount);
			a.setBalance(a.getBalance()+amount);
			System.out.println("ת�˳ɹ�");
			break;
		}
		if(this.getCurrentAccount().getBalance() <amount&&(amount%100==0))
			System.out.println("sorry,you can't afford it!!!");
		if(amount%100!=0)
			System.out.println("ֻ��ת��Ϊ100���������Ľ��");
	}
		}
	}
}
	