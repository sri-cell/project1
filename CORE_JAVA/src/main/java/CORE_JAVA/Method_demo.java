package CORE_JAVA;
import java.io.*;


public class Method_demo
{
	public void add(int a,int b)
	{
		System.out.println("addtion:"+(a+b));
	}
	public int subtraction(int a ,int b)
	{
		return a-b;
	}
	public static void multiplication(int a, int b)
	{
		System.out.println("multiplication:"+(a*b));
	}
	public static void division(int a,int b)
	{
		System.out.println("div:"+(a/b));
	}
	public static void main(String[] args) {
		while(ss.equals("yes"))
		{
		System.out.println("press 1,2,3,4-add,sub,mul,div");
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter ur first number");
		String str =  br.readLine();
		int p= Integer. parseInt(str);
		
		System.out.println("enter second num");
		String str2 = br.readLine();
		int q = Integer.parseInt(str2);
		System.out.println("enter ur opreation");
		String s= br.readLine();
		int op = Integer.parseInt(s);
		Method_demo md = new Method_demo();
		
		switch(op)
		{
			
			case 1:  md.add( a,   b);
				   break;
			case 2:   int k=md.subtraction(a, b);
			       System.out.println("sub:"+k);
				   break;
			case 3:  Method_demo. multiplication(a,b);
				     break;
			case 4:    division(a,b);
				    break;
		}
		System.out.println("do u want to continu press'yes'");
		String ss= br.readLine();
		}
		
	}
		
}

