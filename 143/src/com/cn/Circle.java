package com.cn;

public class Circle extends Shape {
	double n;
	Circle(double n){
		this.n=n;
	}
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*Math.pow(n, 2);
	}

}
