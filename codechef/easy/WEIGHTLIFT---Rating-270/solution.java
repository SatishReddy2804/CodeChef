import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        int a=Math.max(a1,a2);
        int b=Math.max(b1,b2);
        int c=Math.max(c1,c2);       
        System.out.println(a+b+c);
	}
}
