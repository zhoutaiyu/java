package cmo.cn;

public class Manager extends Salary {

	Manager(double basicSalary) {
		super(basicSalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("����Ĺ̶�����Ϊ"+this.getBasicSalary()+"Ԫ");
}
}
