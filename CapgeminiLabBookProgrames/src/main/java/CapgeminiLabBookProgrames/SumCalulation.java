package CapgeminiLabBookProgrames;
import java.util.*;
public class SumCalulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number");
		int n = scan.nextInt();
		SumCalulation sm = new SumCalulation();
		System.out.println(sm.calulateSum(n));
		

	}
	public  int calulateSum(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum = sum + i;
			}
			
		}
		return sum;
	}

}
