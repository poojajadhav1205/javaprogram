package pack;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner Scanner= new Scanner(System. in);
		System.out.println("Enter first String");
		String str1 =Scanner.nextLine();
		System.out.println("Enter Second String");
		String str2 =Scanner.nextLine();
		System.out.println(str1.contains(str2)? "yes":"no:");
	}

}
