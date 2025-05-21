package Day7;
import java.util.InputMismatchException;
import java.util.Scanner;
public class emo4 {
	void add() throws ArithmeticException,InputMismatchException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		emo4 s1=new emo4();
		s1.add();
	}
	}
