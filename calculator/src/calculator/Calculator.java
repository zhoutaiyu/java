package calculator;

public class Calculator {
	//、定义两个整型数据成员。
	//2、定义构造方法，给数据成员初始化。
	//3、类定义加（addition）、减（subtration）、乘（multiplication）、除（division）等公有成员方法，分别对两个成员变量执行加、减、乘、除的运算。
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
