# Pascal's Triangle

## 📌 Problem Statement

Given an integer `numRows`, return the first `numRows` of Pascal's Triangle.

The first and last elements of every row are `1`. Every other element is the sum of the two elements directly above it.

Example for `numRows = 5`:

    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1

---

## Difficulty

🟢 Easy

---

## Topic

- Arrays
- 2D Array
- Dynamic Programming

---

## 💡 Approach

I used a 2D array to store the values of previously generated rows.

For every row:

1. Set the first and last elements to `1`.
2. Calculate the inner elements using the previous row.
3. Add the generated row to the result list.

For an inner element:

    mat[i][j] = mat[i-1][j-1] + mat[i-1][j]

For example:

    1 2 1
     ↓ ↓
    1 3 3 1

The inner values are:

    1 + 2 = 3
    2 + 1 = 3

This process is repeated until all `numRows` are generated.

---

## 🔍 Example

Input:

    numRows = 5

Output:

    [
        [1],
        [1, 1],
        [1, 2, 1],
        [1, 3, 3, 1],
        [1, 4, 6, 4, 1]
    ]

---

## ⏱️ Complexity Analysis

**Time Complexity:** O(n²)

All elements in the triangle are generated row by row.

**Space Complexity:** O(n²)

The 2D array and result list store the generated triangle.

---

## 🧠 Key Learning

- Building a triangle row by row
- Using previous row values to calculate the current row
- Working with 2D arrays and nested lists
- Understanding the basic idea of Dynamic Programming