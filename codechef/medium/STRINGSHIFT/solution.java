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
        sc.nextLine();
        while(t-->0)
        {
            int x=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            StringBuilder sb=new StringBuilder(s);
            for(int i=0;i<sb.length();i++)
            {
                if(sb.charAt(i)=='z');
                {
                    sb.setCharAt(i,'a');
                }
            }
            System.out.println(sb.toString());
        }
	}
}
