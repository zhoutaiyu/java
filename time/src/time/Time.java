package time;

import java.util.Scanner;

public  class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int x,cnt=0;
		boolean a=true,b=true;
		int array[]=new int[6];
		int sum=0;
		if(n>=0&&n<=100000)
		{
			while(n>0){
				x=n%10;
				
				if(x%2==0)
				a=false;
				
				cnt++;
				if(cnt%2==0)
				b=false;
				
				if(a==b)
					array[cnt-1]=1;
				else
					array[cnt-1]=0;
	
				n=n/10;
			}
		}
		for(int i=0;i<cnt;i++)
			sum= sum+(int)(array[i]*Math.pow(2.0, i));
		System.out.println(sum);
	}
}