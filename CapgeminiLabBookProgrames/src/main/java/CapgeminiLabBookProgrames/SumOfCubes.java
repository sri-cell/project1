package CapgeminiLabBookProgrames;

import java.util.Scanner;



public class SumOfCubes {
	public static void main(String[] args) {
		int rem;
		int sum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		while(num>0) {
			
			rem = num%10;
			num = num/10;
			
			sum = sum +(rem*rem*rem);
		}
		System.out.println(sum);
		
	}

}


