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
            int cp=sc.nextInt();
            int sp=sc.nextInt();
            if(cp>sp)
            {
                System.out.println("LOSS");
            }
            else if(cp==sp)
            {
                System.out.println("NEUTRAL");
            }
            else
            {
                System.out.println("PROFIT");
            }
        }
	}
}
