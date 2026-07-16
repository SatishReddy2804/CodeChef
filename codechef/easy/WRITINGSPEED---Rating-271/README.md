# WRITINGSPEED - Rating 271

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Writing Speed

Rahul has a $5$-page assignment due in $60$ minutes. He can write one page in $X$ minutes.

Determine if Rahul can complete the assignment within the given time constraint.

### Input Format
- The only line of input will contain a single integer $X$, denoting the time taken (in minutes) by Rahul to write one page.
### Output Format

Print `YES` if Rahul can complete the assignment in time, otherwise print `NO`.

You may print each character of the output in either uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints
- $1 \leq X \leq 1000$
### Sample 1:
Input
Output

```
5
```

```
YES
```

### Explanation:

If Rahul can write one page in $5$ minutes, then he can write $5$ pages in $25$ minutes. So, he will be able to complete the assignment in time.

### Sample 2:
Input
Output

```
45
```

```
NO
```

### Explanation:

If Rahul can write one page in $45$ minutes, then he will write $5$ pages in $225$ minutes. So, he will not be able to complete the assignment in time.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-16T02:09:10.679Z  

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
        System.out.println(((5*x)<=60)?"YES":"NO");
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WRITINGSPEED)