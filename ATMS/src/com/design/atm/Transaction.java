//�����࣬�����࣬��BalanceInquiry��Deposit��Withdrawal�ĸ���
package com.design.atm;

public  abstract class Transaction {
		
		private int accountNum;                      //�˻���
		private Screen screen;                         //�����������Ļ
		private BankDatabase bankDatabase;  //�������ݿ⣬�Ա�����˻����µĶ���
	
		//����Ϊ��Ա������getter����
		public int getAccountNum() {
			return accountNum;
		}
		
		public Screen getScreen() {
			return screen;
		}
		
		public BankDatabase getBankDatabase() {
			return bankDatabase;
		}

		//���췽��,��������г�ʼ��������ִ��������˺ţ���ʾ��Ϣ����Ļ�Ͷ�Ӧ�����ݿ⣬����Ĺ��캯�����̳иù��캯��
		public Transaction(int accountNum, Screen screen,
				BankDatabase bankDatabase) {
			this.accountNum = accountNum;
			this.screen = screen;
			this.bankDatabase = bankDatabase;
		}
		
		//�鷽��execute
		abstract public void execute();	
		
}
