package Day8;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Demo14 {
	public static void main(String[] args) {
		try {
			File obj=new File("C:\\Users\\lavan\\OneDrive\\Desktop\\sem.txt");
			Scanner R=new Scanner(obj);
			while(R.hasNextLine()) {
				String data =R.nextLine();
				System.out.println(data);
			}
			R.close();
					
		}
		catch(FileNotFoundException e) {
			System.out.println("an error has occured");
			e.printStackTrace();
		}
	}

}
