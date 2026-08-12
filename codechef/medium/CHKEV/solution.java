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
        int flag=0;
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                flag=1;
                break;
            }
        }
        System.out.println((flag==1)?"YES":"NO");
	}
}
