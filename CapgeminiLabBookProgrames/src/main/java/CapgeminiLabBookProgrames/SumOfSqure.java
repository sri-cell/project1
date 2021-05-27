package CapgeminiLabBookProgrames;
import java.util.*;
public class SumOfSqure {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number");
		int num = scan.nextInt();
		
SumOfSqure ss = new SumOfSqure();
     System.out.println( ss.calculateSum(num));
	}
	public int calculateSum(int a) {
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=a;i++)
		{
			sum1 = sum1+(i*i);
			sum2 = sum2+i;
		}
		 sum2 = sum2*2;
		 return sum1-sum2;
		
		
		
	}

}
