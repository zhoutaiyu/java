package fibonacii;

public class Fibonacii {
	
	public int compute(int n)
	{
		int i=n;
		if(i==2)
		{
			return 1;
		}
		if(i==1)
		{
			return 1;
		}
		else
		{
			return compute(i-1)+compute(i-2);
		}
	}
}
