package guessS;

import java.util.Scanner;

public class TouCoin {
		private Screen screen=new Screen();
		private int coin=0;
		Scanner input =new Scanner(System.in);
		void touCoin(){
			screen.printnextLine("******   ******");
			screen.printnextLine("��ӭ����������Ϸ��");
			screen.printnextLine("��Ϸ����");
			screen.printnextLine("Ͷ��һԪӲ�Һ��㽫����λ����һ�������");
			screen.printnextLine("������У�����������");
			screen.printnextLine("��һ�β��У�ë�����  �ڶ��β��У����  �����β��У���߳�   ���Ĵβ��У������ǹ   ����β��У�ƴͼ");
			screen.printnextLine("ף�����");
		while(true){
			screen.printnextLine("��Ͷ��1ԪӲ��");
			coin=input.nextInt();
			Clear.clear();
			if(coin==1){
				screen.printnextLine("��Ϸ3s�󼴽���ʼ��������׼��");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			else
				screen.printnextLine("sorry,��Ͷ��һԪӲ��");
		}
		}
	}
