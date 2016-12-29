package cmo.cn;

public class Worker extends Salary {
	private double daySalary;
	private double days;

	Worker(double daySalary,double days){
		this.days=days;
		this.daySalary=daySalary;
	}
	
	Worker(){
		
	}
	
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("一般工人的工资为"+(this.days*this.daySalary)+"元");
	}

}
