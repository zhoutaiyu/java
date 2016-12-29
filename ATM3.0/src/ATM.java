import java.util.Scanner;

public class ATM {
	private Account CurrentAccount = null;
	Scanner input = new Scanner(System.in);
	private String choice="Y";
	private Login l;

	// 添加用户信息
	public ATM() {}
	
	public boolean login(){
		l=new Login();
		CurrentAccount=l.enter();
		if(CurrentAccount!=null)
			return true;
		else
			return false;
	}

	public void meue() {
        System.out.println("");
		while (choice.equals("Y")) {
			System.out.println("***1.查询个人信息   ***");
			System.out.println("***2.   存款          ***");
			System.out.println("***3.   取款          ***");
			System.out.println("***4.  修改密码     ***");
			System.out.println("***5.   转账          ***");
			System.out.println("***6.   退出          ***");
			System.out.println("请输入您想进行操作序号");
			switch (input.nextInt()) {
			//查询个人信息
			case 1:
				System.out.println(CurrentAccount.toString());
				break;
			//存款
			case 2:
				System.out.println("请放入需要存的人民币");
				new Deposit(this.CurrentAccount).deposit(input.nextDouble());
				break;
			//取款
			case 3:
				System.out.println("请输入你想取出的金额");
				new WithDraw(this.CurrentAccount).withDraw(input.nextDouble());
				break;
			// 密码修改
			case 4:
				System.out.println("请输入你的新密码");
				new ModPassword(this.CurrentAccount).modify(input.next());
				break;
			//转账
			case 5:
                System.out.println("请输入被转账用户账号");
                String s=input.next();
                Account a;
                if((a=new Query().query(s))!=null){
                System.out.println("请输入金额");
                double x=input.nextDouble();
                new AtoB(this.CurrentAccount).aTOb(x,a);
                System.out.println(this.CurrentAccount);
                System.out.println(a);
                }
				break;
			case 6:
				input.close();
				System.out.println("欢迎您的使用，再见");
				System.exit(0);
			}
			System.out.println("是否继续进行功能操作？");
			System.out.println("是的话请按Y,if not,退出请按其他键");
			System.out.println("我是小亮，一直在这里。");
			if(input.next().equals("Y")==false){
				choice=" ";
				System.exit(0);
			}
			
		}
	}

}
