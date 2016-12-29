package com.cn;

public class Triangle extends Shape {
	double n;
	double m;
	
	Triangle(double n,double m){
		this.n=n;
		this.m=m;
	}
	
	public double getArea() {
		// TODO Auto-generated method stub
		return n*m/2.0;
	}

}
