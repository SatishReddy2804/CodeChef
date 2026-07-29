# UPDWPAL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Up-Down Palindrome

You're given an array $A$ of length $N$.

You can perform the following operation on it:

- Choose an integer $X$.
- Then, for each index $i$ ($1 \le i \le N$), If $A_i \le X$, add $1$ to $A_i$. Otherwise, subtract $1$ from $A_i$.

For example, if $A = [2, 6, 3, 4, 3]$ and you choose $X = 3$, the array becomes $[3, 5, 4, 3, 4]$.

You can perform this operation  **at most once**, but you are free to choose whichever value of $X$ you want.

Is it possible to turn the array $A$ into a palindrome by performing this operation  **at most once** ?

Note that the array $A$ is called a palindrome if and only if $A_i = A_{N+1-i}$ for each $1 \le i \le N$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the array. The second line contains $N$ space-separated integers $A_1, \ldots, A_N$.
### Output Format

For each test case, output on a new line the answer: `Yes` if the array can be turned into a palindrome, and `No` otherwise.

Each character of the output can be printed in either uppercase or lowercase, i.e. the strings `NO`, `No`, `nO`, and `no` will be considered equivalent.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N \leq 2\cdot 10^5$
- $1 \le A_i \le 10^9$
- The sum of $N$ across all tests won't exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
3
3
1 3 1
4
4 3 5 6
4
4 2 4 1

```

```
Yes
Yes
No

```

### Explanation:

 **Test case $1$:**  The array is already a palindrome.

 **Test case $2$:**  Choose $X = 4$. This turns the array into $[5, 4, 4, 5]$ which is a palindrome.

 **Test case $3$:**  It can be verified that no value of $X$ will allow $A$ to be turned into a palindrome.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-29T16:12:15.787Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public boolean isPossible(int arr[],int x)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=x)
            {
                arr[i]+=1;
                sb.add(String.valueOf(arr[i]));
            }
            else
            {
                arr[i]-=1;
                sb.add(String.valueOf(arr[i]));
            }
        }
        String s=sb.toString();
        for(int i=0;i<s.length()/2;i++)
        {
            int x=Integer.ValueOf(s.charAt(i));
            int y=Integer.ValueOf(s.charAt(s.length()-i-1));
            if(x!=y)
            {
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt();
            int arr[]=new int[x];
            for(int i=0;i<x;i++)
            {
                arr[i]=sc.nextInt();
            }
            int l=0;
            int r=(int) Math.pow(10,9);
            while(l<=r)
            {
                int m=l+(r-l)/2;
                if(isPossible(arr,m))
                {
                    System.out.println("Yes");
                    return;
                }
                else
                {
                    l=m+1;
                }
            }
            System.out.println("False");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/UPDWPAL)