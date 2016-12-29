package fileLetter;
import java.io.*;

class File
{
		public static void main(String[] args)
		{
				//声明输入流、输出流的引用
				FileInputStream ins;
				FileOutputStream ous;
				//缓冲区buffer
				byte[] buffer=new byte[1000];
				try
				{
				//创建代表输入流的对象
					ins=new FileInputStream("01.txt");
					ous=new FileOutputStream("to.txt");
					int t;	
				//1.第一种方式：一次读取一个字节，并以整数的形式返回，-1代表流的			
			    while((t=ins.read())!=-1)
					{
							System.out.print((char)t);
					}	
					
				//2.第二种方式：先把数据读到缓冲区
					//t=ins.read(buffer,0,buffer.length);
					
				//把数据先放到缓冲区，再一次性写入硬盘
					//ous.write(buffer,0,t);
					
					//for(int i=0;i<buffer.length;i++)
						//System.out.print((char)buffer[i]);
					ins.close();			
				}
				catch(FileNotFoundException e)
				{
					System.out.println("FileNotFoundException");	
				}
				catch(IOException e)
				{
					System.out.println("Error");
				}
				
				
		}
}