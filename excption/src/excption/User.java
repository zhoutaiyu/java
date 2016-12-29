package excption;

import java.util.ArrayList;
import java.util.List;

public class User {

	private static List a=new ArrayList<String>();
	User(){
		a.add("aa");
		a.add("bb");
	}
	
	public static Object login(String s){
		if(a.contains(s)){
			return s;
		}
		else
			return new UserNotExitException("用户名不存在");
	}

}
