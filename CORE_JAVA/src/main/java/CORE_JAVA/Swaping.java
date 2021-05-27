package CORE_JAVA;
import java.util.*;


public class Swaping {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter num1");
		int num1 =scan.nextInt();
		System.out.println("enter num2");
		int num2 = scan.nextInt();
		num1 = num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("swap two numbers55");
		System.out.println( num1);
		System.out.println(num2);

	}

}
