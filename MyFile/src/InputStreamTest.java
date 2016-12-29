import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream rf = null;
		try {
			rf=new FileInputStream ("dir/a.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int n=512;
		byte buffer[]=new byte[n];
		try {
			while((rf.read(buffer, 0, n)!=-1)&&(n>0)){
				System.out.println(new String(buffer));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				rf.close();
			}catch(IOException ioe){
				
			}
		}
		

	}

}
