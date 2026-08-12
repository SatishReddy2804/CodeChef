import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public int boolean alice(int arr[],int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0&&arr[i]>=2)
            {
                arr[i]-=2;
                return true;
            }
        }
        return false;
    }
    public int boolean bob(int arr[],int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
                if(arr[i]>1)
                {
                    arr[i]-=2;
                    return true;
                }
                else
                {
                    arr[i]-=1;
                    return true;
                }
            }
        }
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            int c=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            while(sum%2==0)
            {
                if(alice(arr,sum))
                {
                    int c+=2;
                    sum-=2;
                }
                else
                {
                    bob(arr,sum);
                }
                
            }
        }
	}
}
