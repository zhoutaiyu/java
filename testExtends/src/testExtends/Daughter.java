package testExtends;

public class Daughter extends Mother{
	public String hobby;

	public Daughter(double stature, double weight, int age,String hobby) {
		super(stature, weight, age);
		this.hobby=hobby;
	}
	
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void watchCartoons(){//������Ƭ
		System.out.println("���ڿ�����Ƭ��");
	}
		

}
