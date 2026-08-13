# GIANT - Rating 293

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Giant Wheel

Alice is visiting the amusement park!

Alice's height is $X$ centimeters.
The park stipulates that the minimum height necessary to get on the giant wheel is $60$ centimeters.

Will Alice be able to ride on the giant wheel?

### Input Format

The only line of input contains a single integer $X$ — Alice's height.

### Output Format

Output the answer on a single line: `"Yes"` if Alice can ride the giant wheel, and `"No"` otherwise (without quotes).

Each letter of the output may be printed in either uppercase or lowercase, i.e, the strings `NO`, `no`, `No`, and `nO` will all be treated as equivalent.

### Constraints
- $1 \leq X \leq 100$
### Sample 1:
Input
Output

```
59
```

```
No
```

### Explanation:

Alice's height is $59$ centimeters, which is less than the minimum height of $60$.
So, she can't ride the giant wheel.

### Sample 2:
Input
Output

```
60
```

```
Yes
```

### Explanation:

Alice's height is $60$ centimeters, which equals the minimum height of $60$.
So, she can ride the giant wheel.

### Sample 3:
Input
Output

```
61

```

```
Yes

```

### Explanation:

Alice's height is $60$ centimeters, which is greater than the minimum height of $60$.
So, she can ride the giant wheel.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T02:02:47.033Z  

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
        System.out.println((x<60)?"NO":"YES");
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/GIANT)