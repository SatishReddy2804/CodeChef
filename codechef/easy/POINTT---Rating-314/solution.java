import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a>c)
        {
            System.out.println("Alice");
        }
        else if(a==c)
        {
            if(b>=d)
            {
                System.out.println("Alice");
            }
            else
            {
                System.out.println("Bob");
            }
        }
        else
        {
            System.out.println("Bob");
        }
	}
}
