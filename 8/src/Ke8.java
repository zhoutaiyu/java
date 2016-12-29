import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;

public class Ke8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new FileReader("src\\Ke8.java"));
		HashSet<String>set=new HashSet<String>();
		  String gjc[]={"abstract","assert","boolen","break","byte","case","catch","char","class","const",  
	                "continue","default","do","double","else","enum","extends","final","finally","float","for",  
	                "if","implements","import","instanceof","int","interface","long","native","new","package",  
	                "private","protected","public","return","short","static","strictfp","super","switch","synchrpnized",  
	                "this","throw","throws","transient","try","void","volatile","while"}; 
		char a[]=new char[10000];
		int len;
		int count=0;
		for(int i=0;i<gjc.length;i++)
			set.add(gjc[i]);
		while((len=br.read())!=-1)
	    br.read(a,0,a.length);
	    //for(int j=0;j<a.length;j++)
	    //	System.out.println(a[j]);
		String s=String.valueOf(a);
		System.out.println(s);
        String []names=s.split(" s+|;|\\.|\\(|\\)|\\=|\\:");
		//String []names=s.split("(\\w+)(\\W*)");
		for(String s1:set)
		{
			for(String s2:names)
			{
				System.out.println(s2);
				if(s2==s1)
					count++;
			}
		}
		System.out.println(set);
		System.out.println(count);
	}

}
