

import java.io.*;

public class Count {

	public static void main(String[] args) {
		int count=0;
		FileReader s = null;
		FileWriter t=null;
		try {
			s=new FileReader("g://3.txt");
			try {
				t=new FileWriter("g://12.txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(s.read()!=-1){
				count++;
			}
			System.out.println(count);
			//Êä³öÎªL£¬why?
			t.write(count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}