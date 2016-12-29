
public class Jet extends Aircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aircraft s = new Jet();
		s.setColor("blue");
		s.setName("Jet");
		s.start();
		s.run();
		System.out.println("速度为："+s.getSpeed());
		System.out.println("颜色为："+s.getColor());
		System.out.println("名字为："+s.getName());
		s.stop();

	}

}
