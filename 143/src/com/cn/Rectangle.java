package com.cn;

public class Rectangle extends Shape {
	double n;
	double m;
	Rectangle(double n,double m){
		this.n=n;
		this.m=m;
	}
	public double getArea() {
		// TODO Auto-generated method stub
		return n*m;
	}

}
