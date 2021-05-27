package CORE_JAVA;



public class Variables {
         long i;
         short x;
         byte y;
         double z;
         char ch1;
         float f;
       static long j;
       static short p;
       static  double q;
       static float r;
       static char ch2;
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=10;
		System.out.println("local variable:"+k);
		Variables v = new Variables();
		System.out.println("global instance variable:"+v.i);
		System.out.println("global class variable:"+j);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(ch2);
        System.out.println(v.x);
        System.out.println(v.y);
        System.out.println(v.z);
        System.out.println(v.ch1);
        System.out.println(v.f);
       	
       	
	}

}
