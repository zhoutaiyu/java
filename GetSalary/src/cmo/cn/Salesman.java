package cmo.cn;

public class Salesman extends Salary {
	private double extraSalary;
	
	Salesman(double basicSalary,double extraSalary) {
		super(basicSalary);
		this.extraSalary=extraSalary;
		// TODO Auto-generated constructor stub
	}
	
	Salesman(){
		
	}
	
	public void getSalary() {
		System.out.println("������Ա�Ĺ���Ϊ"+(this.extraSalary+this.getBasicSalary())+"Ԫ");
	}

}
