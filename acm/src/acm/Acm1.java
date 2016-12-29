package acm;

import java.util.Scanner;

public class Acm1 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int t, n,m;
		int i,j,k;
		int [] a= new int[100000];
		int [] b= new int[100000];
		int [] c= new int[100000];
		for(i=0;i<100000;i++)
			c[i]=0;
		int count=0;
		t=input.nextInt();
		for(k=0;k<t;k++)
		{
			n=input.nextInt();
			for(i=0;i<n;i++)
			{
			 a[i]=input.nextInt();
			}
			 m=input.nextInt();
			for(i=0;i<m;i++)
			{
				 b[i]=input.nextInt();
			}
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
					if(1<=a[j]&&0<=b[j])
					b[i]=b[i]%a[j];
					c[count++]=b[i];
			}
		}
		for(i=0;i<count;i++)
			System.out.println(c[i]);
	}

}
