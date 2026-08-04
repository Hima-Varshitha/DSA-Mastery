# Baseball Game

## 📌 Problem Statement

You are given a list of operations representing scores in a baseball game.

Operations can be:

- Integer → Add a new score.
- `+` → Add the sum of the previous two scores.
- `D` → Double the previous score.
- `C` → Remove the previous score.

Return the total score after performing all operations.

Example:

```
Input:
["5","2","C","D","+"]

Output:
30
```

---

## Difficulty

🟢 Easy

---

## Topic

- Stack
- Array
- Simulation

---

## 💡 Approach

Use a Stack to store the valid scores.

Steps:

1. Traverse through each operation.
2. If it is a number, push it into the stack.
3. If it is `C`, remove the previous score.
4. If it is `D`, add double the previous score.
5. If it is `+`, add the sum of the previous two scores.
6. Finally, calculate the total of all scores in the stack.

The stack helps maintain the history of previous scores required for future operations.

---

## Complexity Analysis

**Time Complexity:**  
O(n)

**Space Complexity:**  
O(n)

---

## Key Learning

- Using Stack for maintaining history
- Implementing undo-like operations
- Processing sequential operations efficiently