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
		    int c=0;
		    int m=0;
		    boolean b=false;
		    while(m<=1000)
		    {
		        m++;
		        x+=y;
		        c+=z;
		        if(c>=x)
		        {
		            System.out.println(m);
		            b=true;
		            break;
		        }
		    }
		    if(!b)
		    {
		        System.out.println("-1");
		    }
		}
	}
}
