# SWEETSHOP - Rating 262

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Sweets Shop

Sushil went to a sweet shop because he always craves to eat sweets. This is not good for his health as he has diabetes, but he doesn't care. A laddu costs Rs. $10$ while a jalebi costs Rs. $20$.

Initially, Sushil had Rs. $X$ but then Sushil bought $N$ laddus, how many jalebis can he buy with the remaining money?

### Input Format
- The first line of input contains $X$ and $N$ - the initial amount of money Sushil had and the number of laddus he bought already.
### Output Format

For each test case, output on a new line the the number of jalebis he can buy.

### Constraints
- $1 \le X \le 100$
- $1 \le N \le 10$
- $10 \cdot N \le X$
### Sample 1:
Input
Output

```
99 3

```

```
3
```

### Explanation:

Sushil had Rs. $99$ but after spending on buying $3$ laddus, he only has Rs. $69$ left, which is enough to buy only $3$ jalebis.

### Sample 2:
Input
Output

```
100 10

```

```
0
```

### Explanation:

Sushil had Rs. $100$ but he spent all of it on buying laddus. So, he can buy $0$ jalebis.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-06T13:20:31.964Z  

```cpp
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
        int n=sc.nextInt();
        System.out.println((x-10*n)/20);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SWEETSHOP)