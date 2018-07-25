import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		
     ArrayList<String> s=new ArrayList<String>();
     s.add("Purab");
     s.add("Parbhat");
     s.add("Ankur");
     Collections.sort(s);
     System.out.println(s);

     ArrayList<Integer> i=new ArrayList<Integer>();

     i.add(1);
     i.add(28);
     i.add(3);
     Collections.sort(i);
     System.out.println(i);
	}

}
