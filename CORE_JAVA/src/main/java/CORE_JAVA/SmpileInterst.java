package CORE_JAVA;
import java.util.*;
public class SmpileInterst {

	public static void main(String[] args) {
	
       Scanner scan = new Scanner(System.in);
       System.out.println("enter princple amout");
       int p= scan.nextInt();
       System.out.println("enter rate");
       int r = scan.nextInt();
       System.out.println("enter total years");
       int t = scan.nextInt();
      // int R=p*r/100;
       int simpleInterst = p*r*t/100;
       System.out.println("simple interest is:"+simpleInterst);
       
	}

}
