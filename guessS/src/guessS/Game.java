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

		gift.put(1, "ë�����");
		gift.put(2, "���");
		gift.put(3, "��߳�");
		gift.put(4, "�����ǹ");
		gift.put(5, "ƴͼ");

		int a = 0;
		int count = 0;
		int number, flag = 0;
		while (true) {
			// Clear.clear();
			number = (int) (Math.random() * 100 + 1);// [0,1)
			screen.printnextLine("������������������,1-100����");
			while (count < limit) {
				a = input.nextInt();
				count = count + 1;

				if (number < a)
					screen.printnextLine("ƫ��,������" + (limit - count) + "�λ���");

				if (number > a)
					screen.printnextLine("ƫС,������" + (limit - count) + "�λ���");

				if (number == a) {
					screen.printnextLine("��ϲ����" + limit + "���ڴ���ˣ�һ������" + count + "��");
					flag = 1;
				}
				}
			if (flag == 0)
				screen.printnextLine("�ٽ�����" + "����" + number);
			else {
				screen.printnextLine("����" + number + ",��ϲ������" + gift.get(count));
				screen.printnextLine("��Ϸ����");
			}
			count = 0;
			flag = 0;
			t.touCoin();
		}
	}
	
	}