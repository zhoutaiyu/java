
public class Jet extends Aircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aircraft s = new Jet();
		s.setColor("blue");
		s.setName("Jet");
		s.start();
		s.run();
		System.out.println("�ٶ�Ϊ��"+s.getSpeed());
		System.out.println("��ɫΪ��"+s.getColor());
		System.out.println("����Ϊ��"+s.getName());
		s.stop();

	}

}
