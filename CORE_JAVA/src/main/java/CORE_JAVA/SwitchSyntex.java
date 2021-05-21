package CORE_JAVA;

public class SwitchSyntex {
	
public static void main (String[] args)
{
	char grade='A';
	switch(grade)
	{
	case'A':System.out.println("Excellent");
	break;
	case'B': System.out.println("good");
	break;
	case 'C':System.out.println("Average");
	break;
	default:System.out.println("invalid grade");
	}
}
}
