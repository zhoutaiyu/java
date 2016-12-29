import java.util.ArrayList;

public class BankDatabase {
	private ArrayList<Account> list = new ArrayList<Account>();

	// ��֤�˻�����ȷ�ԣ����ж����ݿ����Ƿ��и��˺Ŵ���
	private Account getAccount(String accountNum) {
		for (Account currentAccount : list) {

			if (currentAccount.getID() == accountNum)
				return currentAccount;
		}
		return null;
	}

	// ��֤�û�������˻��������Ƿ�һ��
	public boolean authenticate(String userAccountNum, String password) {
		Account userAccount = getAccount(userAccountNum);

		if (userAccount != null)
			return (userAccount.getPassword()).equals(password);
		else
			return false;
	}

	// ����˻��еĿ������
	public double getAvailableBalance(String userAccountNum) {
		return getAccount(userAccountNum).getBalance();
	}

	// ���
	public void credit(String userAccountNum, int amount) {
		getAccount(userAccountNum).setBalance((getAccount(userAccountNum).getBalance()) + amount);
	}

	// ȡ��
	public void debit(String userAccountNum, double amount) {
		getAccount(userAccountNum).setBalance((getAccount(userAccountNum).getBalance()) - amount);
	}

}
