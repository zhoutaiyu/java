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
		System.out.println("һ�㹤�˵Ĺ���Ϊ"+(this.days*this.daySalary)+"Ԫ");
	}

}
