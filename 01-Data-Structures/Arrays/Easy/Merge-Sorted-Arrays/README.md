# Merge Sorted Array

## 📌 Problem Statement

Given two sorted integer arrays `nums1` and `nums2`, merge `nums2` into `nums1` as one sorted array.

The final sorted array should be stored inside `nums1` without returning a new array.

---

## Difficulty

🟢 Easy

---

## Topic

- Array
- Two Pointer
- Sorting

---

## 💡 Approach

Use the **Two Pointer technique** starting from the end of both arrays.

- Compare the largest elements of `nums1` and `nums2`.
- Place the larger element at the end of `nums1`.
- Move the pointers accordingly.
- Continue until all elements of `nums2` are merged.

This approach modifies the array in-place without using extra space.

---

## Complexity Analysis

**Time Complexity:**  
O(m + n)

**Space Complexity:**  
O(1)

---

## Key Learning

- Understanding two-pointer technique
- Working with sorted arrays
- Performing in-place modifications