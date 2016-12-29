package edu.cn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a= new Rectangle();
		Area b= new Triangle();
		Area c= new Circle();
		Compare d=new Compare();
		double max;
		double aa=a.toarea(5,6),bb=b.toarea(6,1),cc=c.toarea(4,1);
		System.out.println("矩形的面积为："+aa);
		System.out.println("三角形的面积为："+bb);
		System.out.println("圆的面积为："+cc);
		if(d.compare(aa, bb)>d.compare(aa, cc))
		{
			max=d.compare(aa, bb);
			System.out.println("max="+max);
		}
		else
		{
			max=d.compare(aa, cc);
			System.out.println("max="+max);
		}
		
		
		
		
		

		

	}

}
