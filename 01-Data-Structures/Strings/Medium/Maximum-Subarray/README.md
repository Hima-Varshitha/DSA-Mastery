# Maximum Subarray

## 📌 Problem Statement

Given an integer array `nums`, find the subarray with the largest sum and return its sum.

Example:

```
nums = [-2,1,-3,4,-1,2,1,-5,4]

Output: 6
```

The maximum sum subarray is:

```
[4,-1,2,1]
```

---

## Difficulty

🟡 Medium

---

## Topic

- Array
- Dynamic Programming
- Kadane's Algorithm

---

## 💡 Approach

Use Kadane's Algorithm to find the maximum sum subarray.

Steps:

1. Maintain the current running sum of elements.
2. If the running sum becomes negative, reset it to zero.
3. Track the maximum sum obtained during traversal.
4. Handle the case where all numbers are negative.

This avoids checking every possible subarray and improves the brute-force approach.

---

## Complexity Analysis

**Time Complexity:**  
O(n)

**Space Complexity:**  
O(1)

---

## Key Learning

- Kadane's Algorithm
- Optimizing brute-force subarray problems
- Dynamic programming approach using previous results