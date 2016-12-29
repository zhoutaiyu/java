package fibonacii;

import java.io.*;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream s=null;
		FileOutputStream o=null;
		byte buffer[]=new byte[1];
		byte count=0;
		try {
			s=new FileInputStream("g://1.txt");
			o=new FileOutputStream("g://2.txt");
			try {
				while(s.read()!=-1)
				{
					count++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			buffer = ("这个文件的字符数为"+count).getBytes() ;
			//为什么不可以用write直接将count写入。
		    /*try {
				o.write(count);
				System.out.println(count);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			try {
				o.write(buffer);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
