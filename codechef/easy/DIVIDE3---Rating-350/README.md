# DIVIDE3 - Rating 350

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Divide into 3

You have $N$ toffees and $3$ friends. You will divide the toffees among your friends (You are too generous to take one yourself).

You want to make sure that your division is fair. Hence, you want to minimize the  *imbalance*  of your division.
Here, the imbalance is defined as $(\text{mx} - \text{mn})$, where $\text{mx}$ is the maximum toffees any friend received, and $\text{mn}$ is the minimum toffees any friend received.

For example, if the you give $3, 1, 4$ toffees to your friends, then $\text{mx} = 4$ and $\text{mn} = 1$, so the imbalance is $4-1 = 3$.

Find the  **minimum possible**  imbalance.

### Input Format
- The first and only line of input contains a single integer $N$ - the number of toffees you had.
### Output Format

For each test case, output on a new line the minimum possible imbalance.

### Constraints
- $3 \le N \le 10$
### Sample 1:
Input
Output

```
3

```

```
0

```

### Explanation:

You can give each of your friends $1$ toffee, and this has an imbalance of $0$ since all get equal toffees.

### Sample 2:
Input
Output

```
8

```

```
1

```

### Explanation:

You can give friend $1$ $2$ toffees and friends $2$ and $3$, $3$ toffees each. This makes $\text{mx} = 3$ and $\text{mn} = 2$, hence the imbalance is $1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T04:59:20.996Z  

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
        int x=sc.nextInt();
        if(x%3==2)
        {
            System.out.println("1");
	    }
	    else if(x%3==1)
	    {
	        System.out.println("2");
	    }
	    else
	    {
	        System.out.println("0");
	    }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DIVIDE3)