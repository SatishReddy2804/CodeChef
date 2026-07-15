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
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int x=0;
            int y=1;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]%2!=y)
                {
                    x++;
                }
                y=1-y;
            }
            int a=0;
            int b=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]%2!=b)
                {
                    a++;
                }
                b=1-b;
            }
            System.out.println(Math.min(x,a));
        }
	}
}
