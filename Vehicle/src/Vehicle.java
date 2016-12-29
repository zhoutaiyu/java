
public class Vehicle {
	private int speed;
	private String name;
	private String color;
	
	public void start(){
		speed=0;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void stop(){
		speed=0;
	}
	
	public void run(){
		speed++;
	}

}
