package excption;

public class TestFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=test();
		System.out.println(j);
	}
	public static int test(){
		try {
			int i=10/0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

}
