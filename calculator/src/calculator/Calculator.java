package calculator;

public class Calculator {
	//�����������������ݳ�Ա��
	//2�����幹�췽���������ݳ�Ա��ʼ����
	//3���ඨ��ӣ�addition��������subtration�����ˣ�multiplication��������division���ȹ��г�Ա�������ֱ��������Ա����ִ�мӡ������ˡ��������㡣
	private int a;
	private int b;
	
	Calculator(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	Calculator(){
		
	}
	
	public int addition(){
		return this.a+this.b;
	}
	
	public int subtration(){
		return this.a-this.b;
	}
	
	public int multiplication(){
		return a*b;
	}
	
	public double division(){
		return a*1.0/b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
