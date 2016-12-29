package dxs;

import java.util.Scanner;

public class Dxs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int [] a=new int [100];
		int n,m,i,j,max=0;
	  do
	  {
		  n=input.nextInt();
		  m=input.nextInt();
		  a[n]=a[n]+m; 
	  }while(n!=0);
	  do
	  {
		  i=input.nextInt();
		  j=input.nextInt();
		  a[i]=a[i]+j;
	  }while(i!=0);
	  for(i=a.length-1;i>=0;i--)
	  {
		  if(a[i]!=0)
		  {
			  if(i!=0){
				  if(i==1)
					  System.out.print(a[i]+"x"+"+");
				  else
			          System.out.print(a[i]+"x"+i+"+");
			  }else{
				  System.out.println(a[i]);
			  }
		  }
	  }
	}
}