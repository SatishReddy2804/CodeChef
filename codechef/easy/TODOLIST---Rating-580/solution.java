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
            int c=0;
            while(x-->0)
            {
                int y=sc.nextInt();
                if(y>=1000)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
	}
}
