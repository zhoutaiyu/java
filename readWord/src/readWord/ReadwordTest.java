package readWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadwordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> data = new ArrayList<String>();
		byte a[]=new byte[1000];
		StringBuffer e = new StringBuffer();
		String str=null;
		FileInputStream s = null;
		int t;
//		data.add( 1);
//		data.add(3);
//		data.add(2);
//		Collections.sort(data); 
//		System.out.println(data); 
		try {
			 s=new FileInputStream("g://word.txt");
			try {
				t=s.read(a,0,a.length);
				for(int i = 0; i<t; i++){
				e.append((char)a[i]);
				//System.out.println((char)a[i]);
				}
				str=e.toString();
				System.out.println(str);
				String[] str1=str.split(" ");
				for(String rr:str1)
				{
					System.out.println(rr);
					data.add(rr);
				}
				Collections.sort(data); 
				//System.out.println(data); 
				
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		} catch (FileNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		try {
			s.close();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}		
	}

}
