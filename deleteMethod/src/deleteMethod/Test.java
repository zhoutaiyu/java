package deleteMethod;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����·��ɾ���ļ�
		File s = new File("c://1.txt");
		//���·��ɾ���ļ�
		File s1= new File("dir");
		//File t= new File("dir1");  t.mkdirs();�½�һ����SRC��һ��Ŀ¼�µ��ļ���
		s.delete();
		s1.delete();
		
		

	}

}
