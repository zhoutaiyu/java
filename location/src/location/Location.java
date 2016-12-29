package location;

public class Location {
		private int x;
		private int y;
		
		Location(int x,int y){
			this.x=x;
			this.y=y;
		}
		
		Location(){
			
		}
		
		public int getX(){
			return x;
		}
		
		public void setX(){
			this.x=x;
		}
		
		public int getY(){
			return y;
		}
		
		public void setY(){
			this.y=y;
		}
		
		public Location locateNearest(Location Mylocation){
			int i,j,a=1,b=1;
			double min,t;
			min=Math.pow(Mylocation.x-1,2)+Math.pow(Mylocation.y-1,2);
			for(i=1;i<4;i++)
			{
				for(j=1;j<4;j++)
				{
					t=Math.pow(Mylocation.x-i,2)+Math.pow(Mylocation.y-j,2);
					if(t<min)
					{
						if(t!=0)
						{
						min=t;
						a=i;
						b=j;
						}
					}
				}
			}
			Mylocation.x=a;
			Mylocation.y=b;
			return Mylocation;
		}
			

	
	}


