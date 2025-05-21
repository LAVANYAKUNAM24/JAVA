package Day9;
import java.util.*;
public class Demo1 {
	

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(34);
		l1.add(77);
		l1.add(88);
		List<Integer> l2=new ArrayList<Integer>(l1);
		l2.add(82);
		l2.add(37);
		l2.add(77);
		System.out.println(l2);

	}

}
