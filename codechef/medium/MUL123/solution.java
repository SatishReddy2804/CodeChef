import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    public static void main(String[] args)throws java.lang.Exception{
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
            else if((x+1)%3==0){
                z=1;
            }
            else
            {
                int n5=((x/5)+1)*5;
                if(n5%3==0)
                {
                    z=1;
                }
                else
                {
                    z=2;
                }
            }
            System.out.println(z);
        }
    }
}
