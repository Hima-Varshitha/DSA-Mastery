# Valid Anagram

## 📌 Problem Statement

Given two strings `s` and `t`, determine whether `t` is an anagram of `s`.

An anagram is a word or phrase formed by rearranging the letters of another word, using all the original letters exactly once.

Example:

```
s = "anagram"
t = "nagaram"

Output: true
```

---

## Difficulty

🟢 Easy

---

## Topic

- String
- Hashing
- Frequency Count

---

## 💡 Approach

If two strings are anagrams, both must contain the same characters with the same frequencies.

Steps:

1. Check if both strings have the same length.
2. Create a frequency array of size 26 for lowercase English letters.
3. Increment the count for each character in `s`.
4. Decrement the count for each character in `t`.
5. If every value in the frequency array is zero, the strings are anagrams; otherwise, they are not.

This approach avoids sorting and checks character frequencies in a single traversal.

---

## Complexity Analysis

**Time Complexity:**  
O(n)

**Space Complexity:**  
O(1)

---

## Key Learning

- Using a frequency array for character counting
- Comparing strings efficiently without sorting
- Optimizing string problems using constant extra space