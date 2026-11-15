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
            int z=(x-y)%4;
            if(y>=x)
            {
                System.out.println("0");
            }
            else if(z>0)
            {
                System.out.println(((x-y)/4)+1);
            }
            else
            {
                System.out.println((x-y)/4);
            }
        }
	}
}
