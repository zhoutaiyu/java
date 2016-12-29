import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Ke2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("test.dat"));
       LinkedHashSet<String>set1=new LinkedHashSet<String>();
       set1.add("New York");
       LinkedHashSet<String>set2=(LinkedHashSet<String>)set1.clone();
       set1.add("Atlanta");
//       output.writeObject(set1);
//       output.writeObject(set2);
       output.writeObject(set1);
       output.writeObject(set2);
       output.close();
       ObjectInputStream input = new ObjectInputStream(new FileInputStream("test.dat"));
       set1=(LinkedHashSet)input.readObject();
       set2=(LinkedHashSet)input.readObject();
       System.out.println(set1);
       System.out.println(set2);

	}

}
