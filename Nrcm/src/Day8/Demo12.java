package Day8;
import java.io.*;

public class Demo12 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("C:\\Users\\lavan\\OneDrive\\Desktop\\sem.txt");
		if(f1.createNewFile()) {
			System.out.println("file created success");
			
		}else {
			System.out.println("not created success");
		}

	}

}
