import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ke9CompareY implements Comparator<Ke9Point> {
	@Override
	public int compare(Ke9Point a, Ke9Point b) {
		// TODO Auto-generated method stub
		if(a.getY()>b.getY())
		return 1;
		else if(a.getY()==b.getY())
		{
			if(a.getX()>b.getX())
				return 1;
			if(a.getX()==b.getX())
				return 0;
			if(a.getX()<b.getX())
				return -1;
		}
			return -1;
	}
}
