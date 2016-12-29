import java.util.Scanner;

public class TestUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true){
		Soundable a=null;
		int i,j;
		System.out.println("请输入你想使用的音乐设备:");
		i=input.nextInt();
		switch(i)
		{
		case 1:a=new Radio();
		break;
		case 2:a=new Walkman();
		break;
		case 3:a=new MobilePhone();
		break;
		default:System.out.println("sorry,没有这个选项!");
		break;
		}
		if(a!=null)
		{
			a.sounding();
			int choose=0;
			while(choose==0){
			System.out.println("调节音量选项");
			System.out.println("1.up");
			System.out.println("2.down");
			System.out.println("其他，退出音量调节");
			j=input.nextInt();
			switch(j)
			{
			case 1:a.increseVolume();break;
			case 2:a.decreaseVolume();break;
			default:choose=1;
			break;
			}
			}
		}
		System.out.println("感谢你的使用！");
	}
	}

}
