import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    static boolean alice(int arr[],int sum)
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
    static boolean bob(int arr[],int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
                if(arr[i]>1)
                {
                    arr[i]-=2;
                    return true;
                }else
                {
                    arr[i]-=1;
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)throws java.lang.Exception{
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
            while(sum>0)
            {
                if(sum%2==0)
                {
                    if(alice(arr,sum))
                    {
                        c+=2;
                        sum-=2;
                    }
                    else
                    {
                        break;
                    }
                }else{
                    if(bob(arr,sum))
                    {
                        sum--;
                    }else
                    {
                        break;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
