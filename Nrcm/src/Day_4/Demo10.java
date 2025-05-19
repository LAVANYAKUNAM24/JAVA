package Day_4;
class Test10{
	private void add() {
		System.out.println("hi");
	}
	
}
public class Demo10 extends Test10 {
	private void add() {
		System.out.println("hi");
	}
// here we get op
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo10 d1=new Demo10();
		d1.add();//we are trying to access private access thats why we are not getting output
		//it belonhg to particulr class
//when we declare private it cannot accesed to another class
	}

}
