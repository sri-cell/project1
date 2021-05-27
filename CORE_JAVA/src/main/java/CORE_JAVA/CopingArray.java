package CORE_JAVA;
import java.util.*;




public class CopingArray {
	
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("enter array size");
	int size=scan.nextInt();
	int arr1[]= new int[size];
	int arr2[]=new int[size];
	for(int i=0;i<=arr1.length-1;i++)
	{
		arr1[i]=scan.nextInt();
	}
	/*for(int j=0;j<=arr1.length-1;j++)
	{
		arr2[j]=arr1[j];
	}*/
	
	arr1=arr2;
	
	System.out.println(arr1);
	
	System.out.println(arr2);
	
	
}
}
