package Day6;
class Test1{
	final void show() 
	//void show(){
		System.out.println("hii");
	}
}//if we not declare as final it will override
//when declared as final it shows error

public class Demo4 extends Test1{
	void show() {
		int a=90;
		System.out.println(a);
	
		a=98;
		System.out.println(a);
	
	
}
public static void main(String[] args) {
	Demo4 d1=new Demo4();
	d1.show();
	
}}
