package edu.cn;

	import java.text.ParseException;
	import java.text.SimpleDateFormat; 
	import java.util.Calendar;
	import java.util.Date; 
	import java.util.Scanner; 
	
	public class Birthday {   
		public static void main(String args[]) throws ParseException { 
		  String birthday, dayOfWeek = " "; 
		  Date date;  
		  Calendar calendar;  
		  Scanner scanner = new Scanner(System.in); 
		  System.out.println("����������������ڣ�yyyy-MM-dd");  
		  birthday = scanner.next();  // ����һ�����ڸ�ʽ����   
		  SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyy-MM-dd");    // ���һ��������ǰ���ں�ʱ���calendar�����ʵ��  
		  calendar = Calendar.getInstance();  
		  int currentYear = calendar.get(Calendar.YEAR);
		  // ������� birthday����һ��Date����   
		  date = dateFormat.parse(birthday); 
		  // ��date�����ֵ���ݸ� calendar����   calendar.setTime(date); 
		  int days = calendar.get(Calendar.DAY_OF_WEEK);  
		  switch (days) {  
		  case 1:    dayOfWeek = "������";    break; 
		  case 2:     dayOfWeek = "����һ";    break;  
		  case 3:     dayOfWeek = "���ڶ�";    break;
		  case 4:     dayOfWeek = "������";    break;  
		  case 5:     dayOfWeek = "������";    break;  
		  case 6:     dayOfWeek = "������";    break;   
		  case 7:     dayOfWeek = "������";    break;  
		  }  
		  System.out.println("��������ǣ�" + dayOfWeek);  
		  int birthYear = calendar.get(Calendar.YEAR);   
		  if (((birthYear % 4 == 0) && (birthYear % 100 != 0))      || (birthYear % 400 == 0))   
			  System.out.println(birthYear + "�꣺������"); 
		  else     
			  System.out.println(birthYear + "�꣺��������");  
		  int age = currentYear - birthYear;    
		  System.out.println("�������ǣ�" + age + "��");  }  
	}
