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
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int a=Math.min(x,y);
            int b=Math.min(a,z);
            int c=Math.max(x,y);
            int d=Math.max(c,z);
            System.out.println(d-b);
        }
	}
}
