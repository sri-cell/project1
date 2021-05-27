package CORE_JAVA;
import java.util.*;
public class AreaOfCricle {

	public static void main(String[] args) {
		
            Scanner scan = new Scanner(System.in);

	System.out.println("enter radius");
	double radius = scan.nextInt();
	double area = 3.14*radius*radius;
	System.out.println("Area of circle:"+area);
	

}
}