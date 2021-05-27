package CapgeminiLabBookProgrames;
import java.util.*;
public class PrimeNumber {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your number");
		int num = scan.nextInt();
		for(int i=0;i<=num;i++)
		{
			int count =0;
			for(int j=1;j<=i;i++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("i");
			}
		}
		
		
		
	}

}
