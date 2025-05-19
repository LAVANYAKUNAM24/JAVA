package Day6;
//"final class Test2 "declared meanss it will not access it shows error
class Test2 {
	//final void show()
	void show() {
		System.out.println("hii");
	}}
public class Demo5 extends Test2{
	void show() {
		
		int a=89;
		System.out.println(a);
		a=80;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1=new Demo2();
		
		d1.show();

	}

}
