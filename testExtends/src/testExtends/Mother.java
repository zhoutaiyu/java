package testExtends;

public class Mother {
	protected double stature;//���
	protected double weight;//����
	protected int age;      //����
	
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
		System.out.println("���ڹ�����");
	}
	
	public void BeginHousework(){
		System.out.println("����������");
	}
	
}
