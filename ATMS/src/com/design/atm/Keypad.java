package com.design.atm;

import java.util.Scanner;

public class Keypad {
	
		private Scanner input;

	    //���캯������ʼ��input
		public Keypad(){				
				input=new Scanner(System.in);
		}
		
		//����������ȡ�����������
		public int getInput(){
				return input.nextInt();
		}
		
}
