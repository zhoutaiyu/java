package com.hello;

public class TestTranslation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Show s=new Show();
		Translation a=new Forty();//����ת��
		Translation b=new Thirty();
		s.showSentence();
		if(a instanceof Forty)
		{
			a.translate();
		}
		else
			b.translate();
		

	}

}
