package Day8;
class Test2 extends Thread{
	public void run() {
		System.out.println("hii");
	}
}
class Test3 extends Thread{
	public void run() {
		System.out.println("good mrng");
	}
}

public class Demo5 {
	public static void main(String[] args) {
		Test2 t1=new Test2();
		Test3 t2=new Test3();
		t1.start();
		t2.start();
		
	}

}
