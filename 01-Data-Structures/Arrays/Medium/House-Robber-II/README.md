# House Robber II

## 📌 Problem Statement

You are given an integer array `nums` where `nums[i]` represents the amount of money in the `i`th house.

The houses are arranged in a **circle**, meaning the first and last houses are also adjacent.

A robber cannot rob two adjacent houses.

Return the maximum amount of money that can be robbed without triggering the alarm.

Example:

    Input:
    nums = [2, 3, 2]

    Output:
    3

    Explanation:
    We cannot rob both the first and last houses because they are adjacent.
    Therefore, we can rob the house containing `3`.

---

## Difficulty

🟡 Medium

---

## Topic

- Arrays
- Dynamic Programming
- Sliding Range / Subarray

---

## 💡 Approach

House Robber II is similar to House Robber I, but the houses are arranged in a circle.

The main problem is that the first and last houses cannot both be robbed.

To handle this, I divide the circular problem into two independent cases:

### Case 1: Exclude the Last House

Consider only houses from index `0` to `n-2`.

    [0, 1, 2, ..., n-2]

### Case 2: Exclude the First House

Consider only houses from index `1` to `n-1`.

    [1, 2, 3, ..., n-1]

Both cases are now normal House Robber problems.

Finally, I take the maximum result from the two cases:

    max(
        maxRob(nums, 0, n-1),
        maxRob(nums, 1, n)
    )

---

## 🔍 Dynamic Programming Approach

Inside `maxRob()`, I use a DP array similar to House Robber I.

For every house, there are two choices:

1. Rob the current house and add its money to the maximum amount from two houses before it.
2. Skip the current house and keep the maximum amount from the previous house.

The recurrence is:

    dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1])

The `maxRob()` method applies this logic to a selected range of houses.

---

## 🔎 Example Walkthrough

Consider:

    nums = [2, 3, 2]

### Case 1: Exclude Last House

Consider:

    [2, 3]

Maximum amount:

    max(2, 3) = 3

### Case 2: Exclude First House

Consider:

    [3, 2]

Maximum amount:

    max(3, 2) = 3

Finally:

    max(3, 3) = 3

Therefore:

    Output = 3

---

## ⏱️ Complexity Analysis

**Time Complexity:** O(n)

The two ranges together process the houses a constant number of times.

**Space Complexity:** O(n)

A separate DP array is used inside `maxRob()`.

---

## 🧠 Key Learning

- Extending the House Robber I DP pattern
- Handling circular arrays
- Breaking a circular problem into two linear cases
- Reusing a helper method for a repeated DP calculation
- Understanding how excluding one boundary element removes the circular dependency
- Applying the recurrence:

      max(current + previous two, previous one)