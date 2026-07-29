import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public boolean isPossible(int arr[],int x)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=x)
            {
                arr[i]+=1;
                sb.add(String.valueOf(arr[i]));
            }
            else
            {
                arr[i]-=1;
                sb.add(String.valueOf(arr[i]));
            }
        }
        String s=sb.toString();
        for(int i=0;i<s.length()/2;i++)
        {
            int x=Integer.ValueOf(s.charAt(i));
            int y=Integer.ValueOf(s.charAt(s.length()-i-1));
            if(x!=y)
            {
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int arr[]=new int[x];
            for(int i=0;i<x;i++)
            {
                arr[i]=sc.nextInt();
            }
            int l=0;
            int r=(int) Math.pow(10,9);
            while(l<=r)
            {
                int m=l+(r-l)/2;
                if(isPossible(arr,m))
                {
                    System.out.println("Yes");
                    return;
                }
                else
                {
                    l=m+1;
                }
            }
            System.out.println("False");
        }
	}
}
