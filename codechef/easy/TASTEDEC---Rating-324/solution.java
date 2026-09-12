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
            if(2*x>5*y)
            {
                System.out.println("Chocolate");
            }
            else if(2*x==5*y)
            {
                System.out.println("Either");
            }
            else
            {
                System.out.println("Candy");
            }
        }
	}
}
