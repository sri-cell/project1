package CORE_JAVA;

public class SumOfOodNumbers {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<=99;i++)
		{
			if(!(i%2==0)) {
				
				sum = sum+i;
			}
		}
		System.out.println("sum of odd:"+sum);

	}

}
