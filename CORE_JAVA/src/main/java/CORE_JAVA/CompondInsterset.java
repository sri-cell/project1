package CORE_JAVA;
import java.io.*;
import java.util.*;
public class CompondInsterset {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter principle");
       double princple =scan.nextInt();
       System.out.println("enter rate");
       double rate=scan.nextInt();
       System.out.println("enter time");
       double time = scan.nextInt();
       double  a=(1+rate/100);
       double CI = princple*(Math.pow(a,time))-1;
       System.out.println(CI);

	}

}
