
package pack;
import java.util.Scanner;
public class StringEqual {

	public static void main(String[] args) {
   
	Scanner Scanner = new Scanner(System. in);
	System.out.println("Enter first String");
	String str1 =Scanner.nextLine();
	System.out.println("Enter Second String");
	String str2 =Scanner.nextLine();
	boolean areTwoStringEqual = str1.equals(str2);
	System.out.println("Two String are Equal:"+areTwoStringEqual);
    }
    
	
	}


