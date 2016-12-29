package fileLetter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream s=null;
		FileOutputStream b=null;
		byte buffer[]=new byte[1000];
		int t;
				try{
					s=new FileInputStream("dir/01.txt");
					//用t来一个一个接受字节，每个汉字占2个字节。
					/*while((t=s.read())!=-1)
					{
						System.out.println((char)t);
					}*/
					b=new FileOutputStream("dir/02.txt");
					//先放在缓存区里，然后一股脑儿输出
					t=s.read(buffer,0,buffer.length);
					for(int i=0;i<buffer.length;i++)
						System.out.print((char)buffer[i]);
					    b.write(buffer);
				}
				catch(IOException e){
					System.out.println(e.getMessage());
				}
				finally{
					try{
						s.close();
					}
					catch(IOException e){
						
					}
					try{
						b.close();
					}
					catch(IOException e){
						
					}
				}
	
			
	}

}
