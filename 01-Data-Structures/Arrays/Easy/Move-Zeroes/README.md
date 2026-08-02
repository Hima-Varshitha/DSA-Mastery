# Move Zeroes

## 📌 Problem Statement

Given an integer array `nums`, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

The operation must be performed in-place without creating a copy of the array.

Example:

```
Input:
[0,1,0,3,12]

Output:
[1,3,12,0,0]
```

---

## Difficulty

🟢 Easy

---

## Topic

- Array
- Two Pointer
- In-place Algorithm

---

## 💡 Approach

Use a two-pointer technique to place all non-zero elements at the beginning of the array.

Steps:

1. Maintain a pointer `k` for the position of the next non-zero element.
2. Traverse through the array.
3. Whenever a non-zero element is found, place it at index `k`.
4. Fill the remaining positions with zeros.

This modifies the array without using extra space.

---

## Complexity Analysis

**Time Complexity:**  
O(n)

**Space Complexity:**  
O(1)

---

## Key Learning

- Two-pointer technique
- In-place array modification
- Maintaining relative order of elements