# Next Greater Element I

## 📌 Problem Statement

Given two integer arrays `nums1` and `nums2`, where `nums1` is a subset of `nums2`, find the next greater element for each element in `nums1`.

The next greater element of an element `x` is the first element to the right of `x` in `nums2` that is greater than `x`.

If no such element exists, return `-1`.

Example:

```
nums1 = [4,1,2]
nums2 = [1,3,4,2]

Output:
[-1,3,-1]
```

---

## Difficulty

🟢 Easy

---

## Topic

- Stack
- HashMap
- Array
- Monotonic Stack

---

## 💡 Approach

The solution uses a HashMap to store the next greater element for each value in `nums2`.

Steps:

1. Traverse through `nums2`.
2. For every element, search for the first greater element present on its right side.
3. Store the result in a HashMap:
   
```
element → next greater element
```

4. Traverse `nums1` and retrieve the stored values from the HashMap.

If no greater element exists, store `-1`.

---

## Complexity Analysis

**Time Complexity:**  
O(n²)

For each element, we may scan the remaining elements to find the next greater value.

**Space Complexity:**  
O(n)

HashMap is used to store the results.

---

## Key Learning

- Finding relationships between elements in arrays
- Using HashMap for quick result lookup
- Introduction to Next Greater Element pattern
- Understanding the need for Monotonic Stack optimization