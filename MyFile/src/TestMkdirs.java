import java.io.File;
import java.io.IOException;
//创建文件夹及一个txt文件
public class TestMkdirs {
	//static是静态方法，有自己的一块专属内存，在程序运行的时候会首先运行
	//引用时直接类名.方法名就可以调用了，而不是static的只能先通过new对象才能调用
	public static boolean creatDir(){
	File dir =new File("dir");
	dir.mkdirs();
	//获取目录dir对应的File对象
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
