package fileLetter;
import java.io.*;

class File
{
		public static void main(String[] args)
		{
				//�����������������������
				FileInputStream ins;
				FileOutputStream ous;
				//������buffer
				byte[] buffer=new byte[1000];
				try
				{
				//���������������Ķ���
					ins=new FileInputStream("01.txt");
					ous=new FileOutputStream("to.txt");
					int t;	
				//1.��һ�ַ�ʽ��һ�ζ�ȡһ���ֽڣ�������������ʽ���أ�-1��������			
			    while((t=ins.read())!=-1)
					{
							System.out.print((char)t);
					}	
					
				//2.�ڶ��ַ�ʽ���Ȱ����ݶ���������
					//t=ins.read(buffer,0,buffer.length);
					
				//�������ȷŵ�����������һ����д��Ӳ��
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