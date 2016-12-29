import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestXY2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Ke9Point>list = new ArrayList<Ke9Point>();
		Ke9Point [] s=new Ke9Point[100];
		int i;
		for(i=0;i<s.length;i++){
			s[i]=new Ke9Point(Math.random()*100,Math.random()*100); 
			list.add(s[i]);
		}
		Collections.sort(list,new Ke9CompareY());
		for(Ke9Point s1:list){
			System.out.println(s1.getX()+" "+s1.getY());
		}
	}

}
