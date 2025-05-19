package Day2;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		
		String color=args[0];
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



