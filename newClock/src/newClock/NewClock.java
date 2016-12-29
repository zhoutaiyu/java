package newClock;

class NewClock {
	private Display hour =new Display(24);
	private Display minute=new Display(60);
	private Display second=new Display(60);
	
	NewClock(int a,int b,int c){
		this.hour.setValue(a);
		this.minute.setValue(b);
		this.second.setValue(c);
	}
	public void start(){
		second.increase();
		if(second.getValue()==0)
		{
			minute.increase();
			if(minute.getValue()==0)
			{
				hour.increase();
			}
		}
		//System.out.println(this.toString());
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d",hour.getValue(),minute.getValue(),second.getValue());
	}
	}


