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
        if(x%3==2)
        {
            System.out.println("1");
	    }
	    else if(x%3==1)
	    {
	        System.out.println("2");
	    }
	    else
	    {
	        System.out.println("0");
	    }
	}
}
