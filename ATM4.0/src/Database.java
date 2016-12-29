import java.util.ArrayList;

public class Database {
	private ArrayList<Account> list = new ArrayList<Account>();
	
	Database(){
		Account a1 = new Account("201501", "刘壮", 1, "123456");
		Account a2 = new Account("201502", "kitty", 1000.0, "123456");
		Account a3 = new Account("201503", "马克思", 1500, "123456");
		Account a4 = new Account("201504", "恩格斯", 1500, "123456");
		Account a5 = new Account("201505", "图灵", 5000, "123456");
		Account a6 = new Account("201506", "雨果", 5000, "123456");
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
	}

	public ArrayList<Account> getList() {
		return list;
	}

	public void setList(ArrayList<Account> list) {
		this.list = list;
	}

}
