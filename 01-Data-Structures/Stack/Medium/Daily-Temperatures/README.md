# Daily Temperatures

## 📌 Problem Statement

Given an array of daily temperatures, return an array where each element represents the number of days you have to wait until a warmer temperature.

If there is no future day with a higher temperature, store `0`.

Example:

```
Input:
[73,74,75,71,69,72,76,73]

Output:
[1,1,4,2,1,1,0,0]
```

Explanation:

- 73 → warmer temperature after 1 day (74)
- 75 → warmer temperature after 4 days (76)
- 76 → no warmer temperature, so 0

---

## Difficulty

🟡 Medium

---

## Topic

- Stack
- Monotonic Stack
- Array

---

## 💡 Approach

Use a **Monotonic Decreasing Stack** to store indices of temperatures.

Instead of checking every future day, maintain a stack of temperatures that are waiting for a warmer day.

Steps:

1. Traverse the temperature array from right to left.
2. Store indices of temperatures in the stack.
3. Before adding the current temperature:
   - Remove all indices whose temperatures are smaller than or equal to the current temperature.
4. If the stack is not empty:
   - The top element represents the next warmer day.
   - Calculate the difference between indices.
5. Push the current index into the stack.

The stack always contains temperatures in decreasing order.

---

## Example Walkthrough

Input:

```
[73,74,75,71]
```

Processing from right:

```
71 → stack
75 → removes 71 because 71 cannot be warmer
74 → next warmer is 75
73 → next warmer is 74
```

Answer:

```
[1,1,0,0]
```

---

## Complexity Analysis

**Time Complexity:**  
O(n)

Each index is pushed and popped from the stack at most once.

**Space Complexity:**  
O(n)

The stack stores indices of temperatures.

---

## Key Learning

- Understanding Monotonic Stack pattern
- Storing indices instead of values
- Efficiently finding the next greater element
- Optimizing brute-force searching approaches