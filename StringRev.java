package pack;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		Scanner Scanner= new Scanner(System. in);
		System.out.println("Enter first String");
		String str1 =Scanner.nextLine();
		System.out.println(str1);
		System.out.println(str1.toUpperCase());
		StringBuilder str=new StringBuilder(str1); 
		System.out.println("String="+str1.toString());
		StringBuilder reversestr1=str.reverse(); 
		System.out.println("Reverse=" + reversestr1. toString());

	}

}
