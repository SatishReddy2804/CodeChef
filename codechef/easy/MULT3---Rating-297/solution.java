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
        if(x==1)
        {
            System.out.println("0");
        }
        else
        {
            while(x%3!=0)
            {
                x++;
            }
            System.out.println(x);
        }
	}
}
