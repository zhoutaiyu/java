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
		Account a3=new Account(201503,"马克思",1500,"123456");
		Account a4=new Account(201504,"恩格斯",1500,"123456");
		Account a5=new Account(201505,"图灵",5000,"123456");
		Account a6=new Account(201506,"雨果",5000,"123456");*/
		System.out.println("*********欢迎使用工商银行ATM机***********");
		for(i=0;i<3;i++)
		{   
			System.out.println("请输入您的账号");
			ID=input.nextInt();
			System.out.println("请输入密码");
			password=input.nextLine();
			for(Account a:list){
				if(a.getID()==ID&&a.getPassword()==password)
					
			}
//			if(input.nextLine().equals(account.getPassword()))
//			{
//				System.out.println("您好，请选择您想进行的操作");
//				break;
//			}
//			else
//				System.out.println("密码输入错误");
		}
		/*if(i==3)
			System.out.println("三次输入错误，此卡已被锁定");
		else
		{
			while(true){
			System.out.println("***1.查询余额***");
			System.out.println("***2. 存款     ***");
			System.out.println("***3. 取款     ***");
			System.out.println("***4.修改密码***");
			System.out.println("***5.  转账  ***");
			System.out.println("***6.  退出  ***");
			switch(input.nextInt()){
			case 1:account.remainingBalance();
			break;
			case 2:System.out.println("请将人民币放入");
				account.deposit(input.nextDouble());
				break;
			case 3:
				System.out.println("请输入你想取出的金额");
				account.withDraw(input.nextDouble());
			break;
			case 4:
				System.out.println("请输入新密码");
				account.setPassword(input.nextLine());
				System.out.println("请再次输入新密码");
				account.setPassword(input.nextLine());
				System.out.println("密码修改成功");
				break;
			case 5:
				int a;
				double b;
				System.out.println("请输入你想转账的账号和金额");
				a=input.nextInt();
				System.out.println("请输入你想转账的账号和金额");
				b=input.nextDouble();
				account.tranferOfA(a,b);
				break;
			case 6:System.exit(0);
			}
			
		}
		
	}*/
	}
	
}
