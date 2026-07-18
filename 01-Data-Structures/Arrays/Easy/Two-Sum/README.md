# Two Sum

## 📌 Problem Statement

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to the target.

---

## Difficulty

🟢 Easy

---

## Platform

LeetCode

---

## Topic

- Array
- Hash Table

---

# 💡 Approach

## HashMap Approach

A brute-force approach checks every possible pair, which takes O(n²).

Instead, we use a HashMap.

For every element:

1. Calculate the required value:

```
target - current number
```

2. Check whether this value already exists in the HashMap.

3. If it exists, we found our answer.

4. Otherwise, store the current number with its index.

---

# Algorithm

1. Create an empty HashMap.
2. Traverse through the array.
3. Calculate complement.
4. Check complement in HashMap.
5. Return indices if found.
6. Store current element.

---

# Complexity Analysis

## Time Complexity

O(n)

## Space Complexity

O(n)

---

# Key Learning

This problem introduces:

- Hashing
- One-pass array traversal
- Optimizing brute force solutions