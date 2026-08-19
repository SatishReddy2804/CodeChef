import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n%3;
        int ans;
        if(r==0)
        {
            ans=n;
        }
        else if
        (r==1){
            ans=n-1;
        }
        else
        {
            ans=n+1;
        }
        System.out.println(ans);
	}
}
