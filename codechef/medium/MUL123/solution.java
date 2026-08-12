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
            int x=sc.nextInt();
            int z=0;
            if(x%3==0)
            {
                z=0;
            }
            else if(x%3==1)
            {
                while(x%5!=0 || x%3!=0)
                {
                    x++;
                    z=1;
                }
                if(x%3==0)
                {
                    z=1;
                }
                if((x+1)%3==0)
                {
                    z++;
                }
            }
            else
            {
                if((x+1)%3==0)
                {
                    z++;
                }
            }
            System.out.println(z);
        }
	}
}
