# Valid Palindrome

## 📌 Problem Statement

Given a string `s`, determine if it is a palindrome after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters.

Example:

```
s = "A man, a plan, a canal: Panama"

Output: true
```

---

## Difficulty

🟢 Easy

---

## Topic

- String
- Two Pointer
- Character Processing

---

## 💡 Approach

First, remove all characters except letters and numbers, and convert them into lowercase.

Then compare the cleaned string with its reversed version.

Steps:

1. Traverse through the string.
2. Store only valid characters.
3. Convert characters to lowercase.
4. Reverse the cleaned string.
5. Compare both strings.

---

## Complexity Analysis

**Time Complexity:**  
O(n)

**Space Complexity:**  
O(n)

---

## Key Learning

- String preprocessing
- Handling special characters
- Checking palindrome efficiently