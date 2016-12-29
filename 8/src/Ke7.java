import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Ke7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		int index = -1;
		int count=0;
		int max=1;
        List <Integer>list=new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        d=input.nextInt();
        while(d!=0)
        {
        	list.add(d);
        	d=input.nextInt();
        }
        System.out.println(list.get(index)+"出现了"+max+"次");
        //System.out.println(index);
        //求其他出现最多次数的字符。
       
	}

}
