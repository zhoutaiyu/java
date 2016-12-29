package cmo.cn;

public abstract class Salary {
	private double basicSalary;//基本工资
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	//构造方法
	Salary(double basicSalary){
		this.basicSalary=basicSalary;
			}
	Salary(){
		
	}
	//抽象方法
	public abstract void getSalary();
	}
	

