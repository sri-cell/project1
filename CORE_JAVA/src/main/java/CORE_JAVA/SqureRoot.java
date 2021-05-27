package CORE_JAVA;
import java.util.*;
public class SqureRoot {

	public static void main(String[] args) {
		int count=0;
		int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter squrw number");
		int num = scan.nextInt();
		for( i=0;i<=num;i++)
		{
			if(i*i==num)
			{
				//System.out.println("the squre:"+i);
				
				
				count++;
				break;
			}
			
		}
		if(count ==1) {
			System.out.println("the squrw:"+i);
		}
		else
		{
			System.out.println("this is not squre root");
		}

	}

}
