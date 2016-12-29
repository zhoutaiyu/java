package com.cn;

public class TestMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape a=new Circle(3);
		Shape b=new Rectangle(4,5);
		Shape c=new Triangle(5,6);
		double w,q;
		System.out.println("圆的面积为："+a.getArea());
		System.out.println("矩形的面积为："+b.getArea());
		System.out.println("三角形的面积为："+c.getArea());
		w=a.compare(a.getArea(), b.getArea());
		q=a.compare(a.getArea(), c.getArea());
		if(w>q)
			System.out.println("max="+w);
		else
			System.out.println("max="+q);
	}

}
