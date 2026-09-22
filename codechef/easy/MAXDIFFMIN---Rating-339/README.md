# MAXDIFFMIN - Rating 339

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Max minus Min

Chef is given $3$ integers $A, B,$ and $C$ such that $A \lt B \lt C$.

Chef needs to find the value of $max(A, B, C) - min(A, B, C)$.

Here $max(A, B, C)$ denotes the maximum value among $A, B, C$ while $min(A, B, C)$ denotes the minimum value among $A, B, C$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of $3$ integers $A, B, C$.
### Output Format

For each test case, output the value of $max(A, B, C) - min(A, B, C)$.

### Constraints
- $1 \leq T \leq 10$
- $1 \leq A \lt B \lt C \leq 10$
### Sample 1:
Input
Output

```
4
1 3 10
5 6 7
3 8 9
2 5 6

```

```
9
2
6
4

```

### Explanation:

 **Test case $1$:**  Here, $max(1, 3, 10) = 10$ and $min(1, 3, 10) = 1$. Thus, the difference is $9$.

 **Test case $2$:**  Here, $max(5, 6, 7) = 7$ and $min(5, 6, 7) = 5$. Thus, the difference is $2$.

 **Test case $3$:**  Here, $max(3, 8, 9) = 9$ and $min(3, 8, 9) = 3$. Thus, the difference is $6$.

 **Test case $4$:**  Here, $max(2, 5, 6) = 6$ and $min(2, 5, 6) = 2$. Thus, the difference is $4$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T02:03:10.314Z  

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
            int y=sc.nextInt();
            int z=sc.nextInt();
            int a=Math.min(x,y);
            int b=Math.min(a,z);
            int c=Math.max(x,y);
            int d=Math.max(c,z);
            System.out.println(d-b);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MAXDIFFMIN)