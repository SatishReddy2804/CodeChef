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
            int c=0;
            int x=arr[0]%2;
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]%2==x)
                {
                    c++;
                    x=1-x;
                }
                else
                {
                    x=arr[i]%2;
                }
            }
            System.out.println(c);
        }
	}
}
