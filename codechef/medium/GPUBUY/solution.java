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
		    int i=0;
		    boolean f=false;
		    int a=0;
		    for(i=1;i<1001;i++)
		    {
		        if(i*(z-y)==x)
		        {
		            f=true;
		            a=i;
		        }
		    }
		    if(f)
		    {
		        System.out.println(a);
		    }
		    else
		    {
		        System.out.println("-1");
		    }
		}

	}
}
