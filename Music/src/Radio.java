
public class Radio implements Soundable {
	private int volume;
	
	@Override
	public void sounding() {
		// TODO Auto-generated method stub
		System.out.println("Hello,I am your Radio!");
	}

	@Override
	public void increseVolume() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println("Radio当前音量为："+volume);
		
	}
	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("Radio当前音量为："+volume);
	}

}
