# Longest Common Prefix

## 📌 Problem Statement

Given an array of strings, find the longest common prefix shared among all strings.

If there is no common prefix, return an empty string.

Example:

```
Input:
["flower","flow","flight"]

Output:
"fl"
```

---

## Difficulty

🟢 Easy

---

## Topic

- String
- String Manipulation
- Prefix Matching

---

## 💡 Approach

Use the first string as the initial prefix and compare it with every other string.

Steps:

1. Assume the first string is the common prefix.
2. Check whether each string starts with the current prefix.
3. If not, reduce the prefix by removing the last character.
4. Continue until all strings contain the prefix or it becomes empty.

---

## Complexity Analysis

**Time Complexity:**  
O(n × m)

where:
- n = number of strings
- m = length of the shortest string

**Space Complexity:**  
O(1)

---

## Key Learning

- Comparing strings efficiently
- Reducing search space using prefixes
- Handling edge cases in string problems