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
            float x=sc.nextInt();
            float y=sc.nextInt();
            float z=sc.nextInt();
            float r=x*y;
            float res=(z/r);
            System.out.println((res*100)>50?"YES":"NO");
        }
	}
}
