import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int cuboidv=1;
        int cubev=1;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=sc.nextInt();
        cuboidv=a*b*c;
        cubev=x*x*x;
        if(cubev>cuboidv)
        {
            System.out.println("Cube");
        }
        else if(cubev==cuboidv)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Cuboid");
        }
	}
}
