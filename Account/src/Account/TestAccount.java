package Account;
import java.util.Date;
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Account account =new Account();
		System.out.println("�����������˺�");
		account.setId(input.nextInt());
		while(true)
		{
			int i=0;
			account.dateCreated();
			System.out.println(account.getDate());
			System.out.println("��ѡ�����");
			System.out.println("1.���ҵ��");
			System.out.println("2.ȡ��ҵ��");
			System.out.println("3.��ӡƾ��");
			System.out.println("4.�˳�ϵͳ");
			i=input.nextInt();
			switch(i)
			{
			case 1: {
					System.out.println("�������������Ľ��");
					account.deposit(input.nextDouble());
					System.out.println("���ɹ�����ǰ���Ϊ"+account.getBalance());
					break;
				}
			
			case 2:{
				System.out.println("����������ȡ���Ľ��");
				account.withDraw(input.nextDouble());
				if(account.getBalance()>=0)
				System.out.println("ȡ��ɹ�����ǰ���Ϊ"+account.getBalance());
				else
				System.out.println("ȡ��ʧ�ܣ�����");
				break;
			}
			
			case 3:{
				System.out.println("");
				break;
			}
			
			case 4:{
				System.out.println("�˳��ɹ�");
				break;
			}
			
			default: {
				System.out.println("�����������������");
			}
			}
			
		}
		
		
	}

}
