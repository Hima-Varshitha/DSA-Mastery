# Contains Duplicate

## 📌 Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

Example:

```
nums = [1,2,3,1]

Output: true
```

---

## Difficulty

🟢 Easy

---

## Topic

- Array
- HashSet
- Hashing

---

## 💡 Approach

Use a HashSet to keep track of elements that have already appeared.

Steps:

1. Create an empty HashSet.
2. Traverse through the array.
3. Try adding each element into the set.
4. If an element already exists, return `true`.
5. If traversal completes, return `false`.

HashSet provides constant-time lookup, making this approach efficient.

---

## Complexity Analysis

**Time Complexity:**  
O(n)

**Space Complexity:**  
O(n)

---

## Key Learning

- Using HashSet for duplicate detection
- Fast lookup using hashing
- Efficient array traversal