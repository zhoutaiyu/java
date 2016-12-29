package Account;
import java.util.Date;
import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Account account =new Account();
		System.out.println("请输入您的账号");
		account.setId(input.nextInt());
		while(true)
		{
			int i=0;
			account.dateCreated();
			System.out.println(account.getDate());
			System.out.println("请选择服务");
			System.out.println("1.存款业务");
			System.out.println("2.取款业务");
			System.out.println("3.打印凭条");
			System.out.println("4.退出系统");
			i=input.nextInt();
			switch(i)
			{
			case 1: {
					System.out.println("请输入您想存入的金额");
					account.deposit(input.nextDouble());
					System.out.println("存款成功，当前余额为"+account.getBalance());
					break;
				}
			
			case 2:{
				System.out.println("请输入您想取出的金额");
				account.withDraw(input.nextDouble());
				if(account.getBalance()>=0)
				System.out.println("取款成功，当前余额为"+account.getBalance());
				else
				System.out.println("取款失败，余额不足");
				break;
			}
			
			case 3:{
				System.out.println("");
				break;
			}
			
			case 4:{
				System.out.println("退出成功");
				break;
			}
			
			default: {
				System.out.println("输入错误，请重新输入");
			}
			}
			
		}
		
		
	}

}
