# CHEFBAKES77 - Rating 397

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef Bakes Cake

Chef has baked $N$ cakes, each weighing $X$ kilograms. Now, he needs to deliver them.

He has many vehicles, that he will use to transport the cakes. Each vehicle can carry at most $Y$ kilograms of cake. It is guaranteed that $Y \ge X$, so each vehicle can carry at least $1$ cake.

How many vehicles will Chef need to transport all the cakes?

### Input Format
- The first and only line of each test case contains $3$ integers - $N, X$ and $Y$.
### Output Format

Output on a new line the minimum number of vehicles Chef will need.

### Constraints
- $1 \le N \le 10$
- $1 \le X \le Y \le 10$
### Sample 1:
Input
Output

```
6 4 6

```

```
6

```

### Explanation:

Each vehicle can only fit $1$ cake, and thus Chef will need $6$ vehicles for $6$ cakes.

### Sample 2:
Input
Output

```
4 1 3

```

```
2

```

### Explanation:

Chef can put $2$ cakes in each of the $2$ vehicles.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T05:51:02.517Z  

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
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int c=(y/x);
        int v=(n+c-1)/c;
        System.out.println(v);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFBAKES77)