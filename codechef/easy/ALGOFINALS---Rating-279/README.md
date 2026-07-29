# ALGOFINALS - Rating 279

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Algomaniac Finals

Algomaniac finals, a part of Convolution Fest of Jadavpur University, will be held on March $17$.
Shreyan can only go to Jadavpur University on March $X$.

Print `YAY` if he can attend the Algomaniac finals and `NO` if he cannot.

### Input Format
- The first and only line of input contains one integer, $X$, the day of march Shreyan can go to Jadavpur University.
### Output Format

Output `YAY` if Shreyan can attend Algomaniac finals, and `NO` otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings `YAY`, `yaY`, `yay`, and `Yay` will all be treated as identical).

### Constraints
- $1 \le X \le 31$
### Sample 1:
Input
Output

```
17

```

```
YAY

```

### Explanation:

Shreyan can go to Jadavpur University on March $17$, which happens to be the day of Algomaniac finals, so he is happy.

### Sample 2:
Input
Output

```
31

```

```
NO
```

### Explanation:

Shreyan can go to Jadavpur University on March $31$, but not on March $17$ when the Algomaniac finals are held and thus misses the Algomaniac finals.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-29T02:10:20.919Z  

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
        System.out.println((x==17)?"YAY":"NO");
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ALGOFINALS)