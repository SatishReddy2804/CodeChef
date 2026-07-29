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
            int y=sc.nextInt();
            int p=sc.nextInt();
            int moves=0;
            while(x*y<p)
            {
                int iX=(x+1)*y;
                int iY=x*(y+1);
                if(iX>=p && iY>=p)
                {
                    moves++;
                    break;
                }
                else if(iX>=p)
                {
                    x++;
                    moves++;
                    break;
                }else if(iY>=p)
                {
                    y++;
                    moves++;
                    break;
                }
                else
                {
                    if(x<y)
                    {
                        x++;
                    }else
                    {
                        y++;
                    }
                    moves++;
                }
            }
            System.out.println(moves);
        }
	}
}
