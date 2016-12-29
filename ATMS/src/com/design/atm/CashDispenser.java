//����ȡ��ڵ���
package com.design.atm;

public class CashDispenser {
		
		private final int INITIAL_COUNT=500;
		private int count;   //��ֵ100��Ǯ�ҵ�����
		
		//���캯�������ڳ�ʼ��
		public CashDispenser(){
				count=INITIAL_COUNT;
		}

		//��ATM��Ǯ����Ŀ�㹻ʱ����ATM��ȡǮ
		public void dispenseCash(int amount){
				int billsRequired=amount/100;
				count-=billsRequired;
		}
		
		//�ж�ATM����ʣ���Ǯ���Ƿ��㹻,ȡ��Ǯ����Ϊ100�ı���
		public boolean isSufficientCash(int amount){
			
				int billsRequired=amount/20;
				if(count>=billsRequired)
					return true;
				else
					return false;
		}		
}
