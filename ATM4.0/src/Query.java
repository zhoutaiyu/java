import java.util.ArrayList;

public class Query {
	private ArrayList<Account> list;

	Query() {
		Login l = new Login(new ATMServer().getDatabase().getList());
		list = l.getList();
	}

	// 查询有无此账户
	public Account query(String number) {

		for (Account a : list) {
			if (a.getID().equals(number)) {
				// System.out.println("此卡存在");
				return a;
			}
		}
		System.out.println("此卡无法读取");
		return null;
	}

}
