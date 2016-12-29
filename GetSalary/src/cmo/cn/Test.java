package cmo.cn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("");
		Salary m=new Manager(5000);
		Salary s=new Salesman(1200,800);
		Salary w=new Worker(80,30);
		m.getSalary();
		s.getSalary();
		w.getSalary();

	}

}
