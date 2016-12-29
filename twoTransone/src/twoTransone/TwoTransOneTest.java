package twoTransone;

import java.io.*;
public class TwoTransOneTest {

	public static void main(String[] args) throws IOException {
		/*FileOutputStream t=null;
		FileInputStream s=null;
		FileInputStream s1=null;
		byte a[]=new byte[1000];
		byte b[]=new byte[1000];
		int n;
		try {
			s=new FileInputStream("g://1.txt");
			s1=new FileInputStream("g://2.txt");
			t=new FileOutputStream("g://3.txt");
			//不能自己读，然后又写道自己文件夹里。
			try {
				n=s.read(a,0,a.length);
				t.write(a,0,n);
				n=s1.read(b,0,b.length);
				t.write(b,0,n);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				t.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				s1.close();
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
		}*/
		FileWriter s=new FileWriter("01.txt");
		FileReader t=new FileReader("02.txt");
		char a[]=new char[20];
		int len;
		while((len=t.read())!=-1)
		{
			s.write('\n');
			s.write(a,0,len);
		}
			}
	}