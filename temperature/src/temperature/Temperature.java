package temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int h=0;
		int c=0;
		h=input.nextInt();
		//°„F = (9/5)*°„C + 32
		c=(int)((h-32)/(9.0/5));
		System.out.println(c);
	}

}
