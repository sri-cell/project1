package CapgeminiLabBookProgrames;
import java.util.*;
public class IncreasingOrder {

	public static void main(String[] args) {
		boolean value = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any number");
		int num = scan.nextInt();
		
		int currentNum = num%10;
		num=num/10;
		while(num>0)
		{
			if(currentNum<=num%10)
			{
				value =true;
			break;
			
			
			}
			currentNum = num%10;
			num = num/10;
		}
		
		if(value)
		{
			System.out.println("it is not increasing order");
		}
		else
		{
			System.out.println(" it is  increasing order");
		}
		

	}

}
