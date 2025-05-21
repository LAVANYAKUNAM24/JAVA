package Day7;

public class Demo9 extends Thread {
	public static void main(String[] args) {
		Demo9 d1=new Demo9();
		Demo9 d2=new Demo9();
		Demo9 d3=new Demo9();
		Demo9 d4=new Demo9();
		
		System.out.println(d1.getName());
		System.out.println(d2.getName());
		System.out.println(d3.getName());
		System.out.println(d4.getState());
	}

}
