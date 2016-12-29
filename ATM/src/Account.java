
public class Account {
	private int ID;//账户号
	private String name;//用户名
	private double balance;//余额
	private String password;//密码
	

	public Account(int i, String string, int j, String string2){}
	
	public Account(int ID,String name,double balance, String password){
		this.ID=ID;
		this.name=name;
		this.balance=balance;
		this.password=password;
	}
	

		public void withDraw(double x){
		if(x>this.balance)
			System.out.println("余额不足");
		else{
		this.balance=this.balance-x;
		System.out.println("取款成功");
		System.out.println("请取走您的钱");
		}
	}
	
	public void deposit(double y){
		this.balance=this.balance+y;
		System.out.println("存款成功");
	}
	
	public void tranferOfA(int Id,double amount ){
		if(this.balance<amount)
			System.out.println("余额不足!");
		else
		{
		this.balance=this.balance-amount;
		account.balance=account.balance+amount;
		System.out.println("转账成功!");
		}
	}
	
	public String toString(){
		return "您好，你的信息为：账户号为:"+this.ID+"用户名："+this.name+"余额："+this.balance;
	}
	
	public void remainingBalance(){
		System.out.println("余额："+this.balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
