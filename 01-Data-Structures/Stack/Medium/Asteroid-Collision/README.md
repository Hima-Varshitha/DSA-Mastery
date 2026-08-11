# Asteroid Collision

## 📌 Problem Statement

Given an array `asteroids` representing asteroids moving in a row:

- The absolute value represents the size of the asteroid.
- Positive values represent asteroids moving to the right.
- Negative values represent asteroids moving to the left.

When two asteroids collide:

- The smaller asteroid is destroyed.
- If both asteroids have the same size, both are destroyed.
- Asteroids moving in the same direction never collide.

Return the state of the asteroids after all collisions.

Example:

```
Input:
[5,10,-5]

Output:
[5,10]
```

Explanation:

```
10 and -5 collide.
10 is larger, so -5 is destroyed.
```

---

## Difficulty

🟡 Medium

---

## Topic

- Stack
- Array
- Simulation

---

## 💡 Approach

Use a Stack to simulate the asteroid movement.

The stack stores asteroids that are still active.

Steps:

1. Traverse through each asteroid.
2. If the current asteroid is moving right (`positive`), add it to the stack.
3. If the current asteroid is moving left (`negative`):
   - Check if the top asteroid in the stack is moving right.
   - A collision occurs.
4. Compare the sizes of both asteroids:
   - If the stack asteroid is smaller, remove it and continue checking.
   - If both are equal, remove the stack asteroid and destroy the current asteroid.
   - If the stack asteroid is larger, destroy the current asteroid.
5. After processing all asteroids, the remaining stack contains the final result.

---

## Example Walkthrough

Input:

```
[3,5,-6,2,-1,4]
```

Processing:

```
3 → stack
5 → stack

-6 collides with 5
5 is destroyed

-6 collides with 3
3 is destroyed

-6 survives

2 → stack

-1 collides with 2
2 survives

4 → stack
```

Final result:

```
[-6,2,4]
```

---

## Complexity Analysis

**Time Complexity:**  
O(n)

Each asteroid is pushed and popped from the stack at most once.

**Space Complexity:**  
O(n)

The stack stores remaining asteroids.

---

## Key Learning

- Using Stack to simulate real-world processes
- Handling multiple conditions during traversal
- Understanding collision-based problems
- Efficiently solving problems using LIFO behavior