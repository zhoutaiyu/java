import java.util.Map;

public class Ke9Point implements Comparable<Ke9Point> {
		private double x;
		private double y;
		Ke9Point(double x,double y){
			this.x=x;
			this.y=y;
		}
	   public double getX() {
			return x;
		}
		public void setX(double x) {
			this.x = x;
		}
		public double getY() {
			return y;
		}
		public void setY(double y) {
			this.y = y;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int compareTo(Ke9Point o) {
		// TODO Auto-generated method stub
		if(this.x>o.x)
			return 1;
		else if(this.x<o.x)
			return -1;
		else
			return 0;
	}
}
