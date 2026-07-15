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
            String s=sc.nextLine();
            StringBuilder sb=new StringBuilder(s);
            for(int i=0;i<s.length();i++)
            {
                char ch=sb.charAt(i);
                if(ch=='z');
                {
                    sb.setCharAt(i,'a');
                }
            }
            System.out.println(sb.toString());
        }
	}
}
