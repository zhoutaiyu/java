
public class Walkman implements Soundable {
	private int volume;
	
	public void sounding() {
		// TODO Auto-generated method stub
		System.out.println("Hello,I am your Walkman!");
	}

	public void increseVolume() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println("Walkman当前音量为："+volume);
	}

	public void decreaseVolume() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("Walkman当前音量为："+volume);
	}

}
