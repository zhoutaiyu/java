package guessS;

import java.util.Scanner;

public class TouCoin {
		private Screen screen=new Screen();
		private int coin=0;
		Scanner input =new Scanner(System.in);
		void touCoin(){
			screen.printnextLine("******   ******");
			screen.printnextLine("欢迎来到猜数游戏机");
			screen.printnextLine("游戏规则");
			screen.printnextLine("投入一元硬币后，你将有五次机会猜一个随机数");
			screen.printnextLine("如果猜中，您将获得礼物。");
			screen.printnextLine("第一次猜中：毛绒玩具  第二次猜中：书包  第三次猜中：玩具车   第四次猜中：玩具手枪   第五次猜中：拼图");
			screen.printnextLine("祝你好运");
		while(true){
			screen.printnextLine("请投入1元硬币");
			coin=input.nextInt();
			Clear.clear();
			if(coin==1){
				screen.printnextLine("游戏3s后即将开始，请做好准备");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			else
				screen.printnextLine("sorry,请投入一元硬币");
		}
		}
	}
