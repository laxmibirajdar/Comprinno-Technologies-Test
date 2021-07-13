/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Q10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		    while(n-->0)
		    {
		        int a=sc.nextInt();
		        double gs=0;
		          if(a<1500)
		          {
		              gs=a+(a*0.1)+(a*0.9);
		          }
		          else if(a>=1500)
		          {
		              gs= a + 500.0+(a*0.98);
		          }
		          System.out.println(gs);
		    }
	}
}
