package com.design.atm;

public class Account {
	
		private int accountNum;   //�˻���
		private int pin;                 //����
		private double totalBalance;        //�ܶ�
		private double availableBalance; //�������
		
		
		//���캯����ʼ��
		public Account(int accountNum, int pin, double totalBalance,
				double availableBalance) {
			super();
			this.accountNum = accountNum;
			this.pin = pin;
			this.totalBalance = totalBalance;
			this.availableBalance = availableBalance;
		}

		//��֤�û�����
		public boolean validatePIN(int pinNum){
			
				if(pin==pinNum)
					return true;
				else
					return false;
		}

		//��Ա������getter����
		public int getAccountNum() {
			return accountNum;
		}

		public double getTotalBalance() {
			return totalBalance;
		}

		public double getAvailableBalance() {
			return availableBalance;
		}
		
		//����		
		public void credit(double amount){
				totalBalance+=amount;
		}
		
		//ȡ���
		public void debit(double amount){
				totalBalance-=amount;
				availableBalance-=amount;
		}	

}
