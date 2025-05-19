package Day6;
class Demo9{
	private static void show() {
		System.out.println("hii");
	}
	static class Test8{
		 static void print() {
			System.out.println("good mrng");
			show();
		}
	}
}
//static inner class
public class Demo8 {

	public static void main(String[] args) {
		Demo9.Test8.print();
		
		

	}

}
