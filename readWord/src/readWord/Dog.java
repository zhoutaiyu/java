package readWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dog implements Comparable <Dog>{
	
	private String name;
	private int age;
	
	Dog(String n,int a){
		name=n;
		age=a;
	}
	
	public int compareTo(Dog u) {
		// TODO Auto-generated method stub
		if(this.age>u.age)
		return 1;
		else
			if(this.age<u.age)
				return -1;
			else
				return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Dog> list = new ArrayList<Dog>();
		list.add(new Dog("shape",3));
		list.add(new Dog("jim",5));
		list.add(new Dog("Bob",1));
		//Dog da[]=list.toArray();
		//Arrays.sort(da);
		Dog[] array =new Dog[list.size()];
        list.toArray(array);
        for(Dog s:array)
        {
        System.out.println(s);
        }
	}

}
	


