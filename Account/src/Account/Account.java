package Account;

import java.util.Date;
public class Account {
	private int id;
	private double balance;
	private Date date;
	
	Account(){
		
	}
	
	public void prompt(){
		System.out.println("欢迎来到中国银行——一号ATM");
	}
	
	public double getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	 public void dateCreated(){
		 Date date=new Date();
		 this.date=date;
	 }
	 
	 public Date getDate(){
		 return this.date;
	 }
	 
	 public  void  withDraw(double balance){
		 this.balance-=balance;
	 }
	 
	 public void  deposit(double balance){
		 this.balance+=balance;
	 }
}
