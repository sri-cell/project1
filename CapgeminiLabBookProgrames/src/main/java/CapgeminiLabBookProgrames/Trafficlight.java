package CapgeminiLabBookProgrames;
import java.util.*;
public class Trafficlight {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your choice");
		String str = scan.next();
		switch(str)
		{
		case "red": System.out.println("stop");
		break;
		case "yellow": System.out.println("ready to go");
		break;
		case "green": System.out.println(" u can go");
		break;
		default: System.out.println("invalid choice");
		}
		
	}

}
