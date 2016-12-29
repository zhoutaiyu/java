package location;

public class TestLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Location c=new Location(2,2);
		int [][] array= new int [4][4];
		c=c.locateNearest(c);
		System.out.println("x的坐标是"+c.getX()+",y的坐标是"+c.getY());
		

	}

}
