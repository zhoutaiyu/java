import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Ke8new {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
			int num = scanner.nextInt();
			int max = 0;
			while(num!=0){
				if(map.containsKey(num)){
//					int count = map.get(num);
//					count++;
					map.put(num,map.get(num)+1);
				}else{
					map.put(num,1);
				}
				num = scanner.nextInt();
			}
			//��ֵȫ���뼯����
			Collection<Integer> coll = map.values();
			max = Collections.max(coll);
			//System.out.println(Collections.frequency(coll, max));
			//����һ��������
			Iterator <Integer> it =map.keySet().iterator();
			while(it.hasNext()){
				int key = it.next();
				int value=map.get(key);
				if(value==max){
					System.out.println(key+"���ִ�����࣬�ﵽ"+value);
				}
					System.out.println("��ã�"+key+"������"+value+"��");
			}
			scanner.close();
		}
}
