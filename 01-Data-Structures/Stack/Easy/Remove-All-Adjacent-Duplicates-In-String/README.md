# Remove All Adjacent Duplicates In String

## 📌 Problem Statement

Given a string `s`, repeatedly remove adjacent duplicate characters until no adjacent duplicates remain.

Return the final string after all removals.

Example:

```
Input:
"abbaca"

Output:
"ca"
```

Explanation:

```
abbaca
bb removed → aaca
aa removed → ca
```

---

## Difficulty

🟢 Easy

---

## Topic

- Stack
- String
- Simulation

---

## 💡 Approach

Use a Stack to store characters while traversing the string.

Steps:

1. Traverse each character of the string.
2. Compare the current character with the top element of the stack.
3. If they are the same, remove the top element.
4. Otherwise, add the current character to the stack.
5. The remaining characters in the stack form the final answer.

The stack automatically handles repeated removals because every new character is checked against the updated top element.

---

## Complexity Analysis

**Time Complexity:**  
O(n)

**Space Complexity:**  
O(n)

---

## Key Learning

- Using Stack for string manipulation
- Handling repeated adjacent operations efficiently
- Applying LIFO behavior to solve simulation problems