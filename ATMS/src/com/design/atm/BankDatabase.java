//���ݿ��࣬Ҳ��Ψһ�ܶ��˻�����ֱ�ӷ��ʵ���
package com.design.atm;

public class BankDatabase {
	
		private Account accounts[];   //���ݿ��е������˻�
		
		//��ʼ�������ڳ�ʼ�����ݿ��е��˺���Ϣ�������˻��š����롢�ܶ�������
		public BankDatabase(){
			
				accounts=new Account[2];
				accounts[0]=new Account(99999,123456,1200.00,1000.00);
				accounts[1]=new Account(99995,23456,1000.00,1000.00);
		}
		
		//��֤�˻�����ȷ�ԣ����ж����ݿ����Ƿ��и��˺Ŵ���
		private Account getAccount(int accountNum){
				for(Account currentAccount:accounts){
					
						if(currentAccount.getAccountNum()==accountNum)
								return currentAccount;
				}
				return null;
		}
		
		//��֤�û�������˻��������Ƿ�һ��
		public boolean authenticate(int userAccountNum,int pin){
				Account userAccount=getAccount(userAccountNum);
				
				if(userAccount!=null)
						return userAccount.validatePIN(pin);
				else
					return false;
		}
		
		//����˻��еĿ������
		public double getAvailableBalance(int userAccountNum){
				return getAccount(userAccountNum).getAvailableBalance();
		}
		
		//����˻����ܶ�
		public double getTotalBalance(int userAccountNum){
				
				return getAccount(userAccountNum).getTotalBalance();
		}
		
		//���
		public void credit(int userAccountNum,double amount){
				getAccount(userAccountNum).credit(amount);
		}
		
		//ȡ��
		public void debit(int userAccountNum,double amount){
				getAccount(userAccountNum).debit(amount);
		}
		

}
