import java.awt.List;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AtmUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(2015,"ÔÆ","1597523");
		Account elseAccount = new Account(2016,"Å£","1597528");
		Set<Account>list=new HashSet<Account>();
		list.add(account);
		list.add(elseAccount);
		Atm atm = new Atm();
		atm.show(account, elseAccount);
	

	}
}
