
public class MobilePhone implements Soundable {
	private int volume;
	
	public void sounding() {
		// TODO Auto-generated method stub
		System.out.println("Hello,I am your MobilePhone!");
	}

	public void increseVolume() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println("MobilePhone当前音量为："+volume);
	}
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("MobilePhone当前音量为："+volume);
	}

}
