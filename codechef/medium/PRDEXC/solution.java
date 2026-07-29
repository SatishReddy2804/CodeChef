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
            int p=sc.nextInt();
            int z=0;
            while(x*y<p)
            {
                if(x>y)
                {
                    x++;
                }
                else
                {
                    y++;
                }
                z++;
            }
            System.out.println(z);
        }
	}
}
