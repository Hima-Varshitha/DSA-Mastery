# Valid Parentheses

## 📌 Problem Statement

Given a string containing only the characters:

```
( ) { } [ ]
```

determine if the input string is valid.

A valid string must satisfy:

- Every opening bracket has a corresponding closing bracket.
- Brackets are closed in the correct order.

Example:

```
Input:
"()[]{}"

Output:
true
```

---

## Difficulty

🟢 Easy

---

## Topic

- Stack
- String
- Parentheses Matching

---

## 💡 Approach

Use a Stack to keep track of opening brackets.

Steps:

1. Traverse through each character of the string.
2. If it is an opening bracket, push it into the stack.
3. If it is a closing bracket:
   - Check whether the top of the stack contains its matching opening bracket.
   - If yes, remove it.
   - Otherwise, the string is invalid.
4. At the end, the stack should be empty for a valid string.

---

## Complexity Analysis

**Time Complexity:**  
O(n)

**Space Complexity:**  
O(n)

---

## Key Learning

- Understanding stack LIFO behavior
- Matching opening and closing brackets
- Using stack for expression validation