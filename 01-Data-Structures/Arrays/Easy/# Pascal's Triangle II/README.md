# Pascal's Triangle II

## 📌 Problem Statement

Given an integer `rowIndex`, return the `rowIndex`th row of Pascal's Triangle.

The rows are zero-indexed, meaning:

    Row 0 → [1]
    Row 1 → [1, 1]
    Row 2 → [1, 2, 1]
    Row 3 → [1, 3, 3, 1]

For example:

    Input:
    rowIndex = 3

    Output:
    [1, 3, 3, 1]

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

I used a 2D array to generate Pascal's Triangle up to the required row.

For each row:

1. The first and last elements are always `1`.
2. The inner elements are calculated using the two values from the previous row.
3. After generating all rows, I extract the required row from the 2D array and return it as a list.

The formula for an inner element is:

    mat[i][j] = mat[i-1][j-1] + mat[i-1][j]

For example, to generate row 3:

    Row 2 → [1, 2, 1]

    1 + 2 = 3
    2 + 1 = 3

    Row 3 → [1, 3, 3, 1]

Finally, I traverse the required row and store its elements in an `ArrayList`.

---

## 🔍 Example

Input:

    rowIndex = 3

Generated Pascal's Triangle:

    [1]
    [1, 1]
    [1, 2, 1]
    [1, 3, 3, 1]

Output:

    [1, 3, 3, 1]

---

## ⏱️ Complexity Analysis

**Time Complexity:** O(n²)

The solution generates all rows from `0` to `n`, and the number of elements increases with each row.

**Space Complexity:** O(n²)

The 2D array stores all values generated up to the required row.

---

## 🧠 Key Learning

- Generating a specific row from Pascal's Triangle
- Reusing the previous row to calculate the current row
- Working with 2D arrays
- Converting a row from an array into an `ArrayList`
- Understanding Dynamic Programming through previously calculated values