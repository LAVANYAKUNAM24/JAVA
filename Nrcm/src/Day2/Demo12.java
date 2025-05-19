package Day2;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a color");
		String color=sc.next();
		switch(color) {
		case "red":
			System.out.println("celeb holi");
			break;
		case "green":
			System.out.println("celeb ugadi");
			break;
		case "orange":
			System.out.println("celeb hanuman jayanti");
			break;
			default:
				System.out.println("no celebration");
		}
	}

}
