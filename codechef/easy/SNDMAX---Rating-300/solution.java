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
            int z=sc.nextInt();
            int arr[]=new int[3];
            arr[0]=x;
            arr[1]=y;
            arr[2]=z;
            Arrays.sort(arr);
            System.out.println(arr[1]);
        }
	}
}
