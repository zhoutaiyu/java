import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Copy {

	public static void main(String[] args) throws IOException {
		/**
		 * ʹ���ļ��ַ��������������ļ��ĸ���
		 * 
		 */
		/*// TODO Auto-generated method stub
		//��������������
		FileInputStream in = new FileInputStream("���ݽṹ������.doc");
		//�������������
		FileOutputStream out = new FileOutputStream("1.doc");
		//��д����
		int len=0;
		byte [] buffer =new byte[1024*10];
		while((len=in.read(buffer))!=-1){
			out.write(buffer, 0, len);
		}
		//�ر�����Դ
		in.close();
		out.close();*/
		/*
		 * ʹ���ַ��ļ����������������ļ��ĸ���
		 */
		/*Reader in = new FileReader("���ݽṹ������.doc");
		Writer out = new FileWriter("2.doc");
		int len=0;
		char [] buffer =new char[1024*10];
		while((len=in.read(buffer))!=-1){
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();*/
		/*FileInputStream in =new FileInputStream("���ݽṹ������.doc");
		BufferedInputStream a = new BufferedInputStream(in);
		FileOutputStream out = new FileOutputStream("1.doc");
		BufferedOutputStream b =new BufferedOutputStream(out);
		int s=0;
		byte[] buffer = new byte[1024];
		while((s=a.read(buffer))!=-1){
			b.write(buffer, 0, s);
		}
		a.close();
		b.close();*/
		BufferedReader a= new BufferedReader(new InputStreamReader(
				new FileInputStream("1.txt")));
		BufferedWriter b=new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("2.txt")));
		int i=0;
		String s=null;
		while((s=a.readLine())!=null){
			if(i!=0){
				b.write("\n");
			}
			b.write(s);
			i++;
		}
		a.close();
		b.close();
	}

}