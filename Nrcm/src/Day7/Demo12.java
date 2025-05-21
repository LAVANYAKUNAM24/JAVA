package Day7;
import java.util.*;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("enter class name");
			String className=s1.next();
			Class.forName(className);
			System.out.println("the class found");
		}catch(ClassNotFoundException e) {
			System.out.println("class not found :"+e.getMessage());
		}finally {
			s1.close();
			
		}

	}

}
