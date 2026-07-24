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
        int res=0;
        if(a<=b)
        {
            res=a*5;
            b=(b-a)*2;
            System.out.println(res+b);
        }
        else
        {
            res=b*5;
            a=a-b;
            System.out.println(res+a);
        }
        
	}
}
