import java.util.Scanner;

public class ModPassword extends Business{
	Scanner input= new Scanner(System.in);
	
	ModPassword(Account account) {
		super(account);
	}

	public void modify(){
		System.out.println("��������ľ�����");
		String s=input.next();
		if(this.getCurrentAccount().getPassword().equals(s)){
			System.out.println("���������������");
			s=input.next();
			this.getCurrentAccount().setPassword(s);
			System.out.println("�����޸ĳɹ�");
		} else {
			System.out.println("������������ʱ�޷��޸�����");
		}
		
	}
}
