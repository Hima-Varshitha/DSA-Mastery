# Min Stack

## 📌 Problem Statement

Design a stack that supports the following operations:

- `push(value)` - Insert an element into the stack.
- `pop()` - Remove the top element.
- `top()` - Get the top element.
- `getMin()` - Retrieve the minimum element in the stack.

The `getMin()` operation should work in constant time.

---

## Difficulty

🟡 Medium

---

## Topic

- Stack
- Design Data Structure
- Auxiliary Stack

---

## 💡 Approach

Use two stacks:

1. **Main Stack**
   - Stores all elements normally.

2. **Minimum Stack**
   - Stores the minimum values encountered so far.

Steps:

- Whenever an element is pushed:
  - Add it to the main stack.
  - If it is smaller than or equal to the current minimum, add it to the minimum stack.

- Whenever an element is removed:
  - If it is equal to the current minimum, remove it from the minimum stack as well.

This allows retrieving the minimum element in O(1) time.

---

## Complexity Analysis

**Time Complexity:**  
O(1) for push, pop, top, and getMin operations.

**Space Complexity:**  
O(n)

---

## Key Learning

- Designing custom data structures
- Using auxiliary data structures
- Optimizing operations for constant time complexity