import java.util.ArrayList;
import java.util.Scanner;

public class Atm {
	Scanner input = new Scanner(System.in);
	
	void show(){
		int i;
		int ID;
		String password;
		Account CurrentAccount; 
		ArrayList<Account> list=new ArrayList<Account>();
		Account a1=new Account(201501, "hello", 1000, "123456");
		/*Account a2=new Account(201502,"kitty",1000,"123456");
		Account a3=new Account(201503,"���˼",1500,"123456");
		Account a4=new Account(201504,"����˹",1500,"123456");
		Account a5=new Account(201505,"ͼ��",5000,"123456");
		Account a6=new Account(201506,"���",5000,"123456");*/
		System.out.println("*********��ӭʹ�ù�������ATM��***********");
		for(i=0;i<3;i++)
		{   
			System.out.println("�����������˺�");
			ID=input.nextInt();
			System.out.println("����������");
			password=input.nextLine();
			for(Account a:list){
				if(a.getID()==ID&&a.getPassword()==password)
					
			}
//			if(input.nextLine().equals(account.getPassword()))
//			{
//				System.out.println("���ã���ѡ��������еĲ���");
//				break;
//			}
//			else
//				System.out.println("�����������");
		}
		/*if(i==3)
			System.out.println("����������󣬴˿��ѱ�����");
		else
		{
			while(true){
			System.out.println("***1.��ѯ���***");
			System.out.println("***2. ���     ***");
			System.out.println("***3. ȡ��     ***");
			System.out.println("***4.�޸�����***");
			System.out.println("***5.  ת��  ***");
			System.out.println("***6.  �˳�  ***");
			switch(input.nextInt()){
			case 1:account.remainingBalance();
			break;
			case 2:System.out.println("�뽫����ҷ���");
				account.deposit(input.nextDouble());
				break;
			case 3:
				System.out.println("����������ȡ���Ľ��");
				account.withDraw(input.nextDouble());
			break;
			case 4:
				System.out.println("������������");
				account.setPassword(input.nextLine());
				System.out.println("���ٴ�����������");
				account.setPassword(input.nextLine());
				System.out.println("�����޸ĳɹ�");
				break;
			case 5:
				int a;
				double b;
				System.out.println("����������ת�˵��˺źͽ��");
				a=input.nextInt();
				System.out.println("����������ת�˵��˺źͽ��");
				b=input.nextDouble();
				account.tranferOfA(a,b);
				break;
			case 6:System.exit(0);
			}
			
		}
		
	}*/
	}
	
}
