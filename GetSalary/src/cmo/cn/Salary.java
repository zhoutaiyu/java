package cmo.cn;

public abstract class Salary {
	private double basicSalary;//��������
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	//���췽��
	Salary(double basicSalary){
		this.basicSalary=basicSalary;
			}
	Salary(){
		
	}
	//���󷽷�
	public abstract void getSalary();
	}
	

