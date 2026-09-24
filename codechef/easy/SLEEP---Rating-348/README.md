# SLEEP - Rating 348

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Sleep deprivation

A person is said to be sleep deprived if he slept  **strictly less than**  $7$ hours in a day.

Chef was only able to sleep $X$ hours yesterday. Determine if he is sleep deprived or not.

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains one integer $X$ — the number of hours Chef slept.
### Output Format

For each test case, output `YES` if Chef is sleep-deprived. Otherwise, output `NO`.

You may print each character of `YES` and `NO` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints
- $1 \leq T \leq 20$
- $1 \le X \le 15$
### Sample 1:
Input
Output

```
3
4
7
10

```

```
YES
NO
NO

```

### Explanation:

 **Test Case 1:**  Since $4 \lt 7$, Chef is sleep deprived.

 **Test Case 2:**  Since $7 \ge 7$, Chef is not sleep deprived.

 **Test Case 3:**  Since $10 \ge 7$, Chef is not sleep deprived.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T04:41:01.811Z  

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
            System.out.println((x<7)?"YES":"NO");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SLEEP)