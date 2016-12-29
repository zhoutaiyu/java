package guessS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
	private Screen screen = new Screen();
	private int limit = 5;
	private TouCoin t = new TouCoin();

	Scanner input = new Scanner(System.in);

	void begin() {
		Map<Integer, String> gift = new HashMap<Integer, String>();

		gift.put(1, "毛绒玩具");
		gift.put(2, "书包");
		gift.put(3, "玩具车");
		gift.put(4, "玩具手枪");
		gift.put(5, "拼图");

		int a = 0;
		int count = 0;
		int number, flag = 0;
		while (true) {
			// Clear.clear();
			number = (int) (Math.random() * 100 + 1);// [0,1)
			screen.printnextLine("输入你觉得中意的数字,1-100以内");
			while (count < limit) {
				a = input.nextInt();
				count = count + 1;

				if (number < a)
					screen.printnextLine("偏大,您还有" + (limit - count) + "次机会");

				if (number > a)
					screen.printnextLine("偏小,您还有" + (limit - count) + "次机会");

				if (number == a) {
					screen.printnextLine("恭喜你在" + limit + "次内答对了，一共答题" + count + "次");
					flag = 1;
				}
				}
			if (flag == 0)
				screen.printnextLine("再接再厉" + "答案是" + number);
			else {
				screen.printnextLine("答案是" + number + ",恭喜你获得了" + gift.get(count));
				screen.printnextLine("游戏结束");
			}
			count = 0;
			flag = 0;
			t.touCoin();
		}
	}
	
	}