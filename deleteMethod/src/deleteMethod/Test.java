package deleteMethod;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//绝对路径删除文件
		File s = new File("c://1.txt");
		//相对路径删除文件
		File s1= new File("dir");
		//File t= new File("dir1");  t.mkdirs();新建一个和SRC在一个目录下的文件夹
		s.delete();
		s1.delete();
		
		

	}

}
