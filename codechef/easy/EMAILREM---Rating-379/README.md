# EMAILREM - Rating 379

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Email Reminders

MoEngage helps the Chef send email reminders about rated contests to the participants.

There are a total of $N$ participants on Chef’s platform, and $U$ of them have told Chef  **not**  to send emails to them.

If so, how many participants should MoEngage send the contest emails to?

### Input Format
- The first and only line of input will contain a single line containing two space-separated integers $N$ (the total number of users) and $U$ (the number of users who don't want to receive contest reminders).
### Output Format

Output in a single line, the number of users MoEngage has to send an email to.

### Constraints
- $1 \leq U \lt N \leq 10^5$
### Sample 1:
Input
Output

```
100 7
```

```
93
```

### Explanation:

Out of $100$ users, $7$ do not want to receive reminders. Hence, MoEngage needs to send email to $93$ users.

### Sample 2:
Input
Output

```
4456 342
```

```
4114
```

### Explanation:

Out of $4456$ users, $342$ do not want to receive reminders. Hence MoEngage needs to send email to $4114$ users.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T07:17:29.270Z  

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
        System.out.println(x-y);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EMAILREM)