package CORE_JAVA;

public class Fibbonaci {

	public static void main(String[] args) {
		
		int a=0;
		int b= 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=6;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
