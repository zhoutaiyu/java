import java.util.Scanner;

public class ModPassword extends Business{
	Scanner input= new Scanner(System.in);
	
	ModPassword(Account account) {
		super(account);
	}

	public void modify(){
		System.out.println("请输入你的旧密码");
		String s=input.next();
		if(this.getCurrentAccount().getPassword().equals(s)){
			System.out.println("请输入你的新密码");
			s=input.next();
			this.getCurrentAccount().setPassword(s);
			System.out.println("密码修改成功");
		} else {
			System.out.println("你的密码错误，暂时无法修改密码");
		}
		
	}
}
