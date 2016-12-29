package cmo.cn;

public class Manager extends Salary {

	Manager(double basicSalary) {
		super(basicSalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("经理的固定工资为"+this.getBasicSalary()+"元");
}
}
