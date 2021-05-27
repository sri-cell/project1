package CapgeminiLabBookProgrames;
import java.util.*;
public class Fabonacci {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value for boundary series");
		int n = scan.nextInt();
		System.out.println("enter 1 for recurive fabonacci series");
		System.out.println("enter 2 for non-recurcive fabonacci series");
		int a = scan.nextInt();		
		
		
		switch(a)
		{
		case 1: Fabonacci.fib(n);
		System.out.println(Fabonacci.fib(n));
		
			break;
		case 2:Fabonacci.nonReFib(n);
			break;
		}
			
			
			
	}
	  static int fib(int n) {
		if(n<=1)
		{
			return n;
		}
		return fib(n-1)+ fib(n-2);
	  }
		
		
		static void nonReFib(int n)
		{
			int a=1;
			int b= 1;
			int c;
			System.out.println(a);
			System.out.println(b);
			for(int i=0;i<=n;i++)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
		}
	}
	
	}



			
			
			
			
			
			
			
			
			
			
			
			
			
	
			
		
	


