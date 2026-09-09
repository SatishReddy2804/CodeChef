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
        if(x<3)
        {
            System.out.println("Gold");
        }
        else if(x>=6)
        {
            System.out.println("Bronze");
        }
        else
        {
            System.out.println("Silver");
        }
	}
}
