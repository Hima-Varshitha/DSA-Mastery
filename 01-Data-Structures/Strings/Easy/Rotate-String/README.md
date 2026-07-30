# Rotate String

## 📌 Problem Statement

Given two strings `s` and `goal`, return `true` if `goal` is a rotation of `s`.

A string is considered a rotation if we can move some characters from the beginning of the string to the end and obtain the target string.

Example:

```
s = "abcde"
goal = "cdeab"

Output: true
```

---

## Difficulty

🟢 Easy

---

## Topic

- String
- String Manipulation
- Substring Search

---

## 💡 Approach

A rotated string can be found inside the concatenation of the original string with itself.

For example:

```
s = "abcde"

s + s = "abcdeabcde"
```

All possible rotations of `s` will appear as substrings inside `s + s`.

Steps:

1. Check if both strings have the same length.
2. Create a new string by concatenating `s` with itself.
3. Check whether `goal` exists as a substring in the new string.
4. Return the result.

---

## Complexity Analysis

**Time Complexity:**  
O(n)

**Space Complexity:**  
O(n)

---

## Key Learning

- Understanding string rotation logic
- Using string concatenation for pattern checking
- Efficient alternative to manually generating rotations