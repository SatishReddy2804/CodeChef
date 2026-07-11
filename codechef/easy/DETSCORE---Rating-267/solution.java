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
            if(y==0)
            {
                System.out.println("0");
            }
            else
            {
                int z=x/10;
                System.out.println(z*y);
            }
        }
	}
}
