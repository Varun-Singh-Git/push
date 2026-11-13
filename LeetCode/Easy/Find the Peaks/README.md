# Find the Peaks

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Easy |
| **Language** | java |
| **Solved On** | November 13, 2026 |
| **Tags** | Array, Enumeration |
| **Link** | [View Problem](https://leetcode.com/problems/find-the-peaks/) |
| **Runtime** | 1 ms |
| **Memory** | 45.1 MB |

## Problem Description

<p>You are given a <strong>0-indexed</strong> array <code>mountain</code>. Your task is to find all the <strong>peaks</strong> in the <code>mountain</code> array.</p>

<p>Return <em>an array that consists of </em>indices<em> of <strong>peaks</strong> in the given array in <strong>any order</strong>.</em></p>

<p><strong>Notes:</strong></p>

<ul>
	<li>A <strong>peak</strong> is defined as an element that is <strong>strictly greater</strong> than its neighboring elements.</li>
	<li>The first and last elements of the array are <strong>not</strong> a peak.</li>
</ul>

<p>&nbsp;</p>
<p><span class="float-right -my-0.5 ml-2 inline-flex select-none items-center" data-example-lang-controls=""><span role="group" class="inline-flex h-6 items-center rounded-sd-md bg-sd-muted p-0.5" data-example-lang-toggle=""><button type="button" aria-pressed="true" class="h-5 max-w-[10rem] truncate whitespace-nowrap rounded-sd-sm border px-2 text-xs font-normal leading-none border-sd-border bg-sd-background text-sd-foreground" fdprocessedid="lf10ch">Original</button><button type="button" aria-pressed="false" class="h-5 max-w-[10rem] truncate whitespace-nowrap rounded-sd-sm border px-2 text-xs font-normal leading-none border-transparent text-sd-muted-foreground hover:text-sd-foreground" fdprocessedid="2do505">Java</button></span></span><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> mountain = [2,4,4]
<strong>Output:</strong> []
<strong>Explanation:</strong> mountain[0] and mountain[2] can not be a peak because they are first and last elements of the array.
mountain[1] also can not be a peak because it is not strictly greater than mountain[2].
So the answer is [].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> mountain = [1,4,3,8,5]
<strong>Output:</strong> [1,3]
<strong>Explanation:</strong> mountain[0] and mountain[4] can not be a peak because they are first and last elements of the array.
mountain[2] also can not be a peak because it is not strictly greater than mountain[3] and mountain[1].
But mountain [1] and mountain[3] are strictly greater than their neighboring elements.
So the answer is [1,3].
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= mountain.length &lt;= 100</code></li>
	<li><code>1 &lt;= mountain[i] &lt;= 100</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: Neat and Clean Solution || Line to Line Explained || In 6 Languages🔥
**Author**: [@ADITYAGABA1322](https://leetcode.com/ADITYAGABA1322/)
**Upvotes**: 18 👍
**Link**: [View Original Post](https://leetcode.com/problems/find-the-peaks/solutions/4356052/)

---

# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The intuition for finding peaks in an array is to iterate through the array and identify elements that are greater than both their left and right neighbors. These elements are the peaks. Peaks essentially represent the points where the increasing sequence changes its trend and starts decreasing.

---

# Approach
<!-- Describe your approach to solving the problem. -->
The approach to finding peaks in the mountain array can be implemented using a simple loop. Here are the steps:

1.) Iterate through the array from the second element to the second-to-last element (i.e., from index 1 to index n-2).

2.) For each element at index i, check if it is greater than both its left neighbor (mountain[i-1]) and its right neighbor (mountain[i+1]).

3.) If the condition is true, then the element at index i is a peak, and its index is added to the result vector.

---


# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:O(1)
<!-- Add your space complexity here, e.g. $$O(n)$$ -->


---
# Please Upvote \uD83E\uDEF6

---


# Code

```C++ []
#include <vector>

class Solution {
public:
    std::vector<int> findPeaks(std::vector<int>& mountain) {
        int n = mountain.size();
        std::vector<int> peaks;

        for (int i = 1; i < n - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.push_back(i);
            }
        }

        return peaks;
    }
};
```
```java []
public class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();

        int n = mountain.length;

        for (int i = 1; i < n - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }
        }

        return peaks;
    }
}
```
```python []
class Solution:
    def findPeaks(self, mountain):
        peaks = []
        n = len(mountain)

        for i in range(1, n - 1):
            if mountain[i] > mountain[i - 1] and mountain[i] > mountain[i + 1]:
                peaks.append(i)

        return peaks
``` 
``` C# []
public class Solution {
    public List<int> FindPeaks(int[] mountain) {
        List<int> peaks = new List<int>();
        int n = mountain.Length;

        for (int i = 1; i < n - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.Add(i);
            }
        }

        return peaks;
    }
}
``` 
```javascript []
/**
 * @param {number[]} mountain
 * @return {number[]}
 */
var findPeaks = function(mountain) {
    const peaks = [];
        const n = mountain.length;

        for (let i = 1; i < n - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.push(i);
            }
        }

        return peaks;
    
};
``` 
``` Swift []
class Solution {
    func findPeaks(_ mountain: [Int]) -> [Int] {
        var peaks: [Int] = []
        let n = mountain.count
        
        for i in 1..<(n - 1) {
            if mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1] {
                peaks.append(i)
            }
        }
        
        return peaks
    }
}





</details>
