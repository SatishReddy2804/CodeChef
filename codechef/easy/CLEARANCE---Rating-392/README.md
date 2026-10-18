# CLEARANCE - Rating 392

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Clearance Sale

Chef's favorite clothing store is holding a clearance sale: for every $2$ t-shirts bought, you receive a third one for free!

Chef bought and paid for $X$ t-shirts from the shop. It is guaranteed that $X$  **is even.** 
How many t-shirts did Chef get from the shop in total?

### Input Format
- The first and only line of input contains a single even integer $X$, the number of t-shirts Chef paid for.
### Output Format

For each test case, output on a new line one integer: the total number of t-shirts Chef will get from the store.

### Constraints
- $2 \leq X \leq 100$
- $X$ is even.
### Sample 1:
Input
Output

```
30

```

```
45
```

### Explanation:

Chef paid for $30$ t-shirts. Every two t-shirts will give Chef one extra free t-shirt, so Chef will get $\frac{30}{2} = 15$ free t-shirts.
The total number of t-shirts is hence $30+15 = 45$.

### Sample 2:
Input
Output

```
88

```

```
132

```

### Explanation:

Chef paid for $88$ t-shirts. Every two t-shirts will give Chef one extra free t-shirt, so Chef will get $\frac{88}{2} = 44$ free t-shirts.
The total number of t-shirts is hence $88+44 = 132$.

### Sample 3:
Input
Output

```
4
```

```
6

```

### Explanation:

Chef paid for $4$ t-shirts. Every two t-shirts will give Chef one extra free t-shirt, so Chef will get $\frac{4}{2} = 2$ free t-shirts.
The total number of t-shirts is hence $4+2 = 6$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T08:34:22.424Z  

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
        System.out.println(x+x/2);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CLEARANCE)