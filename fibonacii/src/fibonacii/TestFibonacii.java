package fibonacii;

import java.io.*;

public class TestFibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int i;
		String s1 = null;
		String line = System.getProperty ("line.separator");
		Fibonacii s= new Fibonacii();
		FileOutputStream t;
		try{
		t=new FileOutputStream("d://12.txt");
		for(i=1;i<=n;i++)
		{
			if(i==1)
			{
				s1=Integer.toString(s.compute(i))+"   ";
				continue;
			}	
			s1=s1.concat(Integer.toString(s.compute(i))+"   ");
			if(i%5==0)
			{
				s1=s1.concat(line);
			}
		}
		
	   byte[] bs=s1.getBytes();
          try {
			t.write(bs);
			
		} catch (IOException e) {
			e.printStackTrace();
       }
        try {
			t.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		catch(FileNotFoundException e){
			System.out.println("FileNotFoundException");
		}
		
		
		
	}

}
