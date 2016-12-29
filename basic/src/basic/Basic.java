package basic;

public class Basic {
	private String name;
	private int age;
	
	Basic(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void diaplay(){
		System.out.println(name);
		System.out.println(age);
	}
}
