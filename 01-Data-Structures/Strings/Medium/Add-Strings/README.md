# Add Strings

## 📌 Problem Statement

Given two non-negative integers represented as strings `num1` and `num2`, return their sum as a string.

The numbers can be very large, so they cannot be directly converted into standard integer data types.

Example:

```text
Input:
num1 = "11"
num2 = "123"

Output:
"134"
```

---

## Difficulty

🟢 Easy

---

## Topic

- String
- Math
- Simulation

---

## 💡 Approach

Perform addition digit by digit, similar to how addition is done manually.

Start from the last digit of both strings and maintain a `carry`.

Steps:

1. Start from the rightmost digits of both numbers.
2. Convert each character into its numeric digit.
3. Add the two digits along with the current `carry`.
4. Store the last digit of the sum in the result.
5. Update the `carry`.
6. Continue until all digits are processed.
7. If a carry remains, add it to the result.

Since the input numbers are represented as strings, this approach avoids integer overflow.

---

## Complexity Analysis

**Time Complexity:**  
O(n + m)

where `n` and `m` are the lengths of the two input strings.

**Space Complexity:**  
O(n + m)

The result is stored in a `StringBuilder`.

---

## Key Learning

- Performing arithmetic using strings
- Handling carry during addition
- Processing numbers from right to left
- Avoiding integer overflow for very large numbers