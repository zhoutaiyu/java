import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestXY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ke9Point [] s=new Ke9Point[100];
		List <Ke9Point> list=new ArrayList<Ke9Point>();
		int i;
		for(i=0;i<s.length;i++){
			s[i]=new Ke9Point(Math.random()*100,Math.random()*100); 
			list.add(s[i]);
		}
		   Arrays.sort(s);//×ñ´ÓCompareable½Ó¿Ú¡£
		   for(int j = 0;j<s.length;j++)
		   {
		   System.out.println(s[j].getX()+" "+s[j].getY());
		   }
	}

}
