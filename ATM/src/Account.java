
public class Account {
	private int ID;//�˻���
	private String name;//�û���
	private double balance;//���
	private String password;//����
	

	public Account(int i, String string, int j, String string2){}
	
	public Account(int ID,String name,double balance, String password){
		this.ID=ID;
		this.name=name;
		this.balance=balance;
		this.password=password;
	}
	

		public void withDraw(double x){
		if(x>this.balance)
			System.out.println("����");
		else{
		this.balance=this.balance-x;
		System.out.println("ȡ��ɹ�");
		System.out.println("��ȡ������Ǯ");
		}
	}
	
	public void deposit(double y){
		this.balance=this.balance+y;
		System.out.println("���ɹ�");
	}
	
	public void tranferOfA(int Id,double amount ){
		if(this.balance<amount)
			System.out.println("����!");
		else
		{
		this.balance=this.balance-amount;
		account.balance=account.balance+amount;
		System.out.println("ת�˳ɹ�!");
		}
	}
	
	public String toString(){
		return "���ã������ϢΪ���˻���Ϊ:"+this.ID+"�û�����"+this.name+"��"+this.balance;
	}
	
	public void remainingBalance(){
		System.out.println("��"+this.balance);
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
