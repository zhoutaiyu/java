import java.io.File;
import java.io.IOException;
//�����ļ��м�һ��txt�ļ�
public class TestMkdirs {
	//static�Ǿ�̬���������Լ���һ��ר���ڴ棬�ڳ������е�ʱ�����������
	//����ʱֱ������.�������Ϳ��Ե����ˣ�������static��ֻ����ͨ��new������ܵ���
	public static boolean creatDir(){
	File dir =new File("dir");
	dir.mkdirs();
	//��ȡĿ¼dir��Ӧ��File����
	File file1=new File(dir,"1.txt");
	try {
		file1.createNewFile();
		return true;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	}
	public static void main(String[] args) {
		boolean s= TestMkdirs.creatDir();
		System.out.println(s);

	}

}
