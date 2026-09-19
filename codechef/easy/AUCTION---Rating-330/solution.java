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
            if(x>y && x>z)
            {
                System.out.println("Alice");
            }
            else if(y>z)
            {
                System.out.println("Bob");
            }
            else
            {
                System.out.println("Charlie");
            }
        }
	}
}
