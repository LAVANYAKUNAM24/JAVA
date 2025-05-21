package Day8;

import java.util.*;
public class Demo17{

	public static void main(String[] args) {
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(12);
		l1.add(23);
		l1.add(16);
		l1.add(55);
		System.out.println(l1);
		Enumeration i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}
		
	}

}
 