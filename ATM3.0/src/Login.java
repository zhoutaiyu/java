import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	private ArrayList<Account> list = new ArrayList<Account>();
	private String currentId;
	private String currentPassword;
	private Account currentAccount;
	Scanner input = new Scanner(System.in);

	Login() {
		Account a1 = new Account("201501", "��׳", 1, "123456");
		Account a2 = new Account("201502", "kitty", 1000.0, "123456");
		Account a3 = new Account("201503", "����˼", 1500, "123456");
		Account a4 = new Account("201504", "����˹", 1500, "123456");
		Account a5 = new Account("201505", "ͼ��", 5000, "123456");
		Account a6 = new Account("201506", "���", 5000, "123456");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
	}

	public Account enter() {

		int i = 0;
		Account b=null;
		System.out.println("*****��ӭ�����ʼ����У�����ATM��С��");
		System.out.println("�����������˺�");
		currentId = input.next();
		  if((b=new Query().query(currentId))!=null){
			Out: for (i = 1; i <= 3; i++) {
				System.out.println("����������");
				currentPassword = input.next();
				for (Account a : list) {
					if (currentId.equals(a.getID()) && currentPassword.equals(a.getPassword())) {
						currentAccount = a;
						break Out;
					}
				}
			}
			if (i == 4)
				System.out.println("***�����������������Ŀ��ѱ�����***");
			else{
				System.out.println("hello"+this.currentAccount.getName());
				System.out.println("***��½�ɹ����ʼһ�ӭ��***");
			}
		}
			return currentAccount;
		}

	public ArrayList<Account> getList() {
		// TODO Auto-generated method stub
		return this.list;
	}

}