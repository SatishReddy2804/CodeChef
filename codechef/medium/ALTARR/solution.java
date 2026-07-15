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
            int c=0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int x=-1;
            int y=-1;
            if(arr[0]%2==0)
            {
                x=0;
            }
            else
            {
                x=1;
            }
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]%2==0)
                {
                    y=0;
                }
                else
                {
                    y=1;
                }
                if(x==y)
                {
                    c++;
                    if(y==0)
                    {
                        y=1;
                    }
                    else
                    {
                        y=0;
                    }
                }
                else
                {
                    x=y;
                }
            }
            System.out.println(c);
        }
	}
}
