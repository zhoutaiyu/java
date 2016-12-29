package testExtends;

public class Mother {
	protected double stature;//身高
	protected double weight;//体重
	protected int age;      //年龄
	
	public Mother(double stature,double weight,int age){
		this.stature=stature;
		this.weight=weight;
		this.age=age;
	}
	
	public Mother(){
		
	}
	public double getStature() {
		return stature;
	}

	public void setStature(double stature) {
		this.stature = stature;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void BeginWork(){
		System.out.println("正在工作！");
	}
	
	public void BeginHousework(){
		System.out.println("正在做家务！");
	}
	
}
