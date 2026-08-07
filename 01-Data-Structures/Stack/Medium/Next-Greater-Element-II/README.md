# Next Greater Element II

## 📌 Problem Statement

Given a circular integer array `nums`, return the next greater element for every element.

The next greater element of a number is the first greater number encountered while moving to the right.

Since the array is circular, after reaching the last element, the search continues from the beginning.

If no greater element exists, return `-1`.

Example:

```
Input:
[1,2,1]

Output:
[2,-1,2]
```

---

## Difficulty

🟡 Medium

---

## Topic

- Stack
- Array
- Circular Array
- Monotonic Stack

---

## 💡 Approach

To handle the circular nature of the array, create a temporary array containing two copies of the original array.

Steps:

1. Create a new array of size `2n`.
2. Copy the original array twice to simulate circular traversal.
3. For each element, search towards the right side for the first greater element.
4. Store the result in the answer array.
5. If no greater element is found, store `-1`.

---

## Complexity Analysis

**Time Complexity:**  
O(n²)

For each element, we may scan the remaining elements in the circular array.

**Space Complexity:**  
O(n)

Extra arrays are used for storing duplicated values and results.

---

## Key Learning

- Handling circular arrays
- Searching elements based on relative positions
- Understanding the Next Greater Element pattern
- Preparing for Monotonic Stack problems