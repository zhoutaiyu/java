import java.util.ArrayList;

public class BankDatabase {
	private ArrayList<Account> list = new ArrayList<Account>();

	// 验证账户的正确性，即判断数据库中是否有该账号存在
	private Account getAccount(String accountNum) {
		for (Account currentAccount : list) {

			if (currentAccount.getID() == accountNum)
				return currentAccount;
		}
		return null;
	}

	// 验证用户输入的账户和密码是否一致
	public boolean authenticate(String userAccountNum, String password) {
		Account userAccount = getAccount(userAccountNum);

		if (userAccount != null)
			return (userAccount.getPassword()).equals(password);
		else
			return false;
	}

	// 获得账户中的可用余额
	public double getAvailableBalance(String userAccountNum) {
		return getAccount(userAccountNum).getBalance();
	}

	// 存款
	public void credit(String userAccountNum, int amount) {
		getAccount(userAccountNum).setBalance((getAccount(userAccountNum).getBalance()) + amount);
	}

	// 取款
	public void debit(String userAccountNum, double amount) {
		getAccount(userAccountNum).setBalance((getAccount(userAccountNum).getBalance()) - amount);
	}

}
