package testExtends;

public class UseExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter baby = new Daughter(178,120,20,"ball");
		System.out.println("女儿的身高为"+baby.getStature()+"体重："+baby.getWeight()+"年龄："+baby.getAge()+"爱好："+baby.getHobby());
		baby.BeginWork();

	}

}
