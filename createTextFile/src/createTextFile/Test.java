package createTextFile;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		int i=0;
		String s=null;
		int t;
		for(i=0;i<100;i++)
		{
			if(i==0)
			{
				t=(int)(Math.random()*100+1);
				//������ת��Ϊ�ַ��������ð�װ��
				s=String.valueOf(t);
			}
			else
			{
				t=(int)(Math.random()*100+1);
				s=" "+String.valueOf(t);
			}
			try {
				//����Ϊд���ļ������Ƿ�׷��
				fw=new FileWriter("g://1.txt",true);
				fw.write(s);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			//����close������������ڻ���������š�
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
