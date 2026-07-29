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
		    int a=-1;
		    for(i=1;i<1001;i++)
		    {
		        if(x+i*y>=z)
		        {
		            a=i;
		            break;
		        }
		    }
		    System.out.println(a);
		}
	}
}
