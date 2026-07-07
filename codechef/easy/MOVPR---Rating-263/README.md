# MOVPR - Rating 263

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Movie Snacks

Chef is watching a movie, and during the intermission, wants to get himself some snacks.

A bucket of popcorn costs $X$ rupees, and a drink costs $Y$ rupees.
There is also a combo offer available, which provides one bucket of popcorn and one drink at a cost of $Z$ rupees.

Chef wants to buy two buckets of popcorn and three drinks.
What's the  **minimum**  amount he needs to pay to do so?

### Input Format
- The first and only line of input will contain three space-separated integers $X, Y,$ and $Z$ — the price of one bucket of popcorn, one drink, and the combo, respectively.
### Output Format

Print a single integer: the minimum price Chef needs to pay to buy two buckets of popcorn and three drinks.

### Constraints
- $50 \leq X, Y, Z \leq 200$
- $X, Y \le Z$
### Sample 1:
Input
Output

```
100 70 160

```

```
390

```

### Explanation:

We can use $2$ combo offers for $160$ each and then a drink for $70$, totalling $390$.

### Sample 2:
Input
Output

```
110 80 200

```

```
460

```

### Explanation:

It is optimal to buy all the $2$ popcorns and $3$ drinks individually for $2 \cdot 110 + 3 \cdot 80 = 460$.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-07T02:08:57.385Z  

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
        int y=sc.nextInt();
        int z=sc.nextInt();
        int a=(x*2)+(y*3);
        int b=(z*2)+y;
        System.out.println(());
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MOVPR)