package sortWord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String b=null;
		String []s1=null;
			FileReader fr =new FileReader("word.txt");
			BufferedReader br = new BufferedReader(fr);
			TreeSet<String> s= new TreeSet<String>();
			b=br.readLine();
			s1 = b.split(" +|\\.");
			for(String str:s1)
			{
				s.add(str);
			}
			for(String str1:s)
			{
				System.out.println(str1);
			}
			fr.close();
			br.close();
		}
	    
	}

