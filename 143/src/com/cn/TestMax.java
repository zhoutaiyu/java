package com.cn;

public class TestMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape a=new Circle(3);
		Shape b=new Rectangle(4,5);
		Shape c=new Triangle(5,6);
		double w,q;
		System.out.println("Բ�����Ϊ��"+a.getArea());
		System.out.println("���ε����Ϊ��"+b.getArea());
		System.out.println("�����ε����Ϊ��"+c.getArea());
		w=a.compare(a.getArea(), b.getArea());
		q=a.compare(a.getArea(), c.getArea());
		if(w>q)
			System.out.println("max="+w);
		else
			System.out.println("max="+q);
	}

}
