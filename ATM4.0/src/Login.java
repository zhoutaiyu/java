import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	private ArrayList<Account> list;
	private String currentId;
	private String currentPassword;
	private Account currentAccount;
	Scanner input = new Scanner(System.in);

	Login() {
		
	}
	
	Login(ArrayList<Account> list){
		this.list=list;
	}

	public Account enter() {

		int i = 0;
		System.out.println("*****欢迎来到皇家银行，我是ATM机小亮");
		System.out.println("请输入您的账号");
		currentId = input.next();
		  if((new Query().query(currentId))!=null){
			Out: for (i = 1; i <= 3; i++) {
				System.out.println("请输入密码");
				currentPassword = input.next();
				for (Account a : list) {
					if (currentId.equals(a.getID()) && currentPassword.equals(a.getPassword())) {
						currentAccount = a;
						break Out;
					}
				}
			}
			if (i == 4)
				System.out.println("***三次密码输入错误，你的卡已被锁定***");
			else{
				System.out.println("hello "+this.currentAccount.getName());
				System.out.println("***登陆成功，皇家欢迎您***");
			}
		}
			return currentAccount;
		}

	public ArrayList<Account> getList() {
		// TODO Auto-generated method stub
		return this.list;
	}

}
