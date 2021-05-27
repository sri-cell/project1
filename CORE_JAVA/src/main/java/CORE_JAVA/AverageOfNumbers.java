package CORE_JAVA;
import java.util.*;

public class AverageOfNumbers {
	public static void main(String[] args) {
		
		AverageOfNumbers.avg();
	}

	public static void avg() {
		int count=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of Array");
		for(int i=0;i<=arr.length-1;i++)
		{
			 arr[i]=scan.nextInt();
		}
		
       for(int i=0;i<=arr.length-1;i++)
       {
    	   sum = sum+arr[i];
    	   count++;
       }
       int result= sum/count;
       System.out.println("Average is:"+result);
	}

}
