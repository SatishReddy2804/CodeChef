# RURT - Rating 375

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Run for Fun

Chef is participating in a race of $Y$ kilometers. However, Chef gets tired and needs to take a rest after every $X$ kilometers.

Can you determine how many times Chef will stop to rest before reaching the finish line?

### Input Format

The only line of input contains two space-separated integers $X$ and $Y$ — the number of kilometers Chef can run before needing a rest, and the total distance of the race in kilometers.

### Output Format

Print a single integer — the number of times Chef will stop to rest before completing the race.

### Constraints
- $1 \leq X,Y \leq 10$
### Sample 1:
Input
Output

```
1 2
```

```
1
```

### Explanation:

After running the first kilometer, Chef gets tired and stops to rest. After resting, he completes the remaining kilometer to finish the race. Since he stops only once before reaching the finish line, the answer is $1$.

### Sample 2:
Input
Output

```
2 5
```

```
2
```

### Explanation:

After running the first $2$ kilometers, Chef gets tired and takes a rest. He then runs another $2$ kilometers and rests again. Finally, he completes the remaining $1$ kilometer to finish the race. Since he stops twice before reaching the finish line, the answer is $2$.

### Sample 3:
Input
Output

```
3 3
```

```
0
```

### Explanation:

After running the first $3$ kilometers, he reaches the finish line without needing to rest.

### Sample 4:
Input
Output

```
4 3
```

```
0
```

### Explanation:

Since the total distance is less than the resting limit, Chef reaches the finish line without stopping.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T23:19:09.602Z  

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
        int y=sc.nextInt();
        if(x>=y) System.out.println("0");
        else System.out.println((y-1)/x);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RURT)