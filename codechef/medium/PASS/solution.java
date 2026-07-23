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
        while(x-->0)
        {
            int s=0;
            int t=0;
            int arr[]=new int[5];
            for(int i=0;i<5;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]>=60)
                {
                    s++;
                    t++;
                }
                else if(arr[i]>=30)
                {
                    t++;
                }
                else
                {
                    continue;
                }
            }
            if(s>=2 && t>=4)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }
        }
	}
}
