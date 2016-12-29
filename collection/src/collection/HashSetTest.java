package collection;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int i;
		HashSet<Integer>s1= new HashSet<Integer>(); 
		HashSet<Integer>s2= new HashSet<Integer>(); 
		HashSet<Integer>s3= new HashSet<Integer>(); 
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s2.add(4);
		s2.add(3);
		s2.add(7);
		System.out.println("请输入你想对集合完成的操作");
		System.out.println("一是进行集合的合并");
		System.out.println("二是集合的交集");
		System.out.println("三是集合的差集");
		i=input.nextInt();
		switch(i){
		//并集
		//s1.addAll(s2);
		//交集,移除不在s2里的元素
		//s1.retainAll(s2);
		//差集,删除s1在s2里的相同的元素
		case 1://并集
		s1.addAll(s2);
		System.out.println(s1);
		break;
		case 2://交集
		s1.retainAll(s2);
		System.out.println(s1);
		break;
		case 3:{
		s3=(HashSet<Integer>) s1.clone();
		s1.removeAll(s2);
		s2.removeAll(s3);
		s1.addAll(s2);
		System.out.println(s1);
		break;
		}
		}

	}

}
