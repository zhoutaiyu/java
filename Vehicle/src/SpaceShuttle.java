
public class SpaceShuttle extends Aircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aircraft s = new SpaceShuttle();
		s.setColor("red");
		s.setName("SpaceShuttle");
		s.start();
		s.run();
		System.out.println("�ٶ�Ϊ��"+s.getSpeed());
		System.out.println("��ɫΪ��"+s.getColor());
		System.out.println("����Ϊ��"+s.getName());
		s.stop();

	}

}
