package com.cn;

public class BookTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Play a=new Play();
//		Play b=new Play();
//		System.out.println(a==b);
//		System.out.println(a.equals(b));
//		Play s;
		try{
			method();
			System.out.println("After the mothod call");
		}
		catch(RuntimeException ex){
			System.out.println("RuntimeException in main");
		}
		catch(Exception e){
			System.out.println("Exception in main");
		}
	}

	private static void method() throws Exception {
		// TODO Auto-generated method stub
		try{
			String s="abc";
			System.out.println(s.charAt(3));
		}
		catch(RuntimeException ex){
			System.out.println("RuntimeException in METHOD");
		}
		catch(Exception e){
			System.out.println("Exception in method");
		}
	}

}
