import java.util.Scanner;

public class Word{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner (System.in);
		String s=input.nextLine();
		int i,count=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' '){
				if(s.charAt(i)!='.')
					count++;
				else
				{
					System.out.print(count);
					break;
				}
			}
			else
			{
				if(s.charAt(i+1)!=' '&&s.charAt(i+1)!='.'){
				System.out.print(count+" ");
				count=0;
				}
				if(s.charAt(i+1)!=' '&&s.charAt(i+1)=='.'){
					System.out.print(count+" ");
					break;
				}
			}
		}
	}

}
