//����ATM������Ļ
package com.design.atm;

public class Screen {
	
	//��������Ļ����ʾһ����Ϣ(�޻���)
	public void displayMessage(String message){
		
			System.out.print(message);
	}
	
	//��������Ļ����ʾһ����Ϣ(�л���)	
	public void displayMessageLine(String message){
		
			System.out.println(message);
	}
	
	//��������Ļ��ʾ���
	public void displayRenminBi(double amount){
		
			System.out.print("��"+amount);
	}
}
