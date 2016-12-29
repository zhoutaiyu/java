package newClock;


public class TestClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
			java.util.Scanner in = new java.util.Scanner(System.in);
			NewClock clock = new NewClock(in.nextInt(), in.nextInt(), in.nextInt());
			clock.start();
			System.out.println(clock);
			in.close();
		}
	}

