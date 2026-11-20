# ACTEMP - Rating 580

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T13:41:59.676Z  

```java
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
            int c=0;
            while(x-->0)
            {
                int y=sc.nextInt();
                if(y>=1000)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ACTEMP)