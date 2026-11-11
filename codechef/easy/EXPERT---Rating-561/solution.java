import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
             float x=sc.nextFloat();
             float y=sc.nextFloat();
             float res=(y/x)*100;
             System.out.println((res)>=50.0?"YES":"NO");
        }
	}
}
