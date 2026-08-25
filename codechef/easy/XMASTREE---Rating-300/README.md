# XMASTREE - Rating 300

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Christmas Trees

Chef opened a tree-selling business this Christmas.

He bought $N$ trees for $A$ rupees, and then sold $M$ trees for $B$ rupees.

What was his profit this Christmas? If Chef instead made a loss of $X$ rupees, print $-X$.

### Input Format
- The first and only line of input contains $4$ integers - $N, A, M$ and $B$.
### Output Format

Output Chef's profit this christmas.

### Constraints
- $1 \le M \le N \le 100$
- $100 \le A \le B \le 1000$
### Sample 1:
Input
Output

```
5 100 2 1000

```

```
1500

```

### Explanation:

Chef bought $5$ trees for $100$ rupees, and then sold $2$ trees for $1000$ rupees, thus his profit was $2000 - 500 = 1500$ rupees.

### Sample 2:
Input
Output

```
5 100 2 100

```

```
-300

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-25T15:26:31.637Z  

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
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a*b-m*n);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/XMASTREE)