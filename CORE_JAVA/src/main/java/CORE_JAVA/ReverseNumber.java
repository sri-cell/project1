package CORE_JAVA;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=123;
		int rem;
		int rev=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
			
		}
		System.out.println(rev);

	}

}
