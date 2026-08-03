import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int c=0;
        if(x<5)
        {
            c=5-x;
        }
        if(y<5)
        {
            c+=(5-y);
        }
        if(z<5)
        {
            c+=(5-z);
        }
        System.out.println(c);
	}
}
