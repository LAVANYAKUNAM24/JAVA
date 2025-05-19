package Day_5;
 class sample15{
int x=80;
void print() {
	System.out.println("hellooo");
}
 }
 
public class Demo15 extends sample15{
	void show() {
		int y=90;
		super.print();
		System.out.println(super.x);
	}
	

public static void main(String[] args) {
	Demo15 d1=new Demo15();
	d1.show();
	
}
}




