package joint;

public class JointDemo implements Runnable {

	public static int a=3;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int k=0;k<5;k++)
			a=a+1;
		System.out.println("a:"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r =new JointDemo();
		Thread t=new Thread (r);
		t.start();
		try {
			t.join(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//t.setPriority(10);
		//System.out.println(t.getPriority());
		System.out.println("a"+a);
	}
}
