package calculator;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner (System.in);
		Calculator c=new Calculator(5,6);
		System.out.println(c.getA()+"+"+c.getB()+"="+c.addition());
		System.out.println(c.getA()+"-"+c.getB()+"="+c.subtration());
		System.out.println(c.getA()+"*"+c.getB()+"="+c.multiplication());
		System.out.println(c.getA()+"/"+c.getB()+"="+c.division());

	}

}
