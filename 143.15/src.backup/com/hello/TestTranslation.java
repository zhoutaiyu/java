package com.hello;

public class TestTranslation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Show s=new Show();
		Translation a=new Forty();//向上转型
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
