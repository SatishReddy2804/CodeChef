# VIDEOWORTH - Rating 382

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Worth of a Video

We know that "A picture is worth a thousand words". So let's calculate the worth of a video using this!

Suppose a video has 24 frames (or pictures) per second, and has a duration of $S$ seconds. We know that each frame is worth $1000$ words. So, how many words is this video worth in total?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single line with a single integer - $S$, the number of seconds in the video.
### Output Format

For each test case, output on a new line the number of words that the video is worth.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq S \leq 100$
### Sample 1:
Input
Output

```
2
1
3

```

```
24000
72000

```

### Explanation:

 **Test case 1:**  The video is 1 second long. And we know that in a second, there are $24$ frames (or pictures). So there are $24$ pictures in this video. Each picture is worth $1000$ words. So the video is worth $24 * 1000 = 24000$ words.

 **Test case 2:**  The video is 3 seconds long. And we know that in a second, there are $24$ frames (or pictures). So there are $3  *24 = 72$ pictures in this video. Each picture is worth $1000$ words. So the video is worth $72*  1000 = 72000$ words.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T15:12:51.220Z  

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
            System.out.println(x*24000);
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VIDEOWORTH)