package CapgeminiLabBookProgrames;
import java.util.*;


public class PowerOfTwo {

	public static void main(String[] args) {
		int ans = 1;
      Scanner scan = new Scanner(System.in);

        System.out.println("enter your number");
        int num = scan.nextInt();
        for(int i=0;i<=num;i++)
        {
        	ans = ans *2;
        	if(ans==num)
        	{
        		
        	System.out.println("yes it is power of 2");
        		break;
        	}
        	
        	
        }
        





	}

}
