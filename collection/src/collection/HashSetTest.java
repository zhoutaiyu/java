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
		System.out.println("����������Լ�����ɵĲ���");
		System.out.println("һ�ǽ��м��ϵĺϲ�");
		System.out.println("���Ǽ��ϵĽ���");
		System.out.println("���Ǽ��ϵĲ");
		i=input.nextInt();
		switch(i){
		//����
		//s1.addAll(s2);
		//����,�Ƴ�����s2���Ԫ��
		//s1.retainAll(s2);
		//�,ɾ��s1��s2�����ͬ��Ԫ��
		case 1://����
		s1.addAll(s2);
		System.out.println(s1);
		break;
		case 2://����
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
