
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
		System.out.println("Radio��ǰ����Ϊ��"+volume);
		
	}
	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("Radio��ǰ����Ϊ��"+volume);
	}

}
