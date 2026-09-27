# House Robber

## 📌 Problem Statement

You are given an integer array `nums` where `nums[i]` represents the amount of money in the `i`th house.

A robber cannot rob two adjacent houses because the alarm will be triggered.

Return the maximum amount of money that can be robbed without robbing two adjacent houses.

Example:

    Input:
    nums = [2,7,9,3,1]

    Output:
    12

    Explanation:
    Rob houses with amounts 2, 9 and 1.

    2 + 9 + 1 = 12

---

## Difficulty

🟡 Medium

---

## Topic

- Arrays
- Dynamic Programming

---

## 💡 Approach

I used a bottom-up Dynamic Programming approach.

The main idea is that for every house, there are two choices:

1. **Rob the current house**  
   If I rob the current house, I cannot rob the previous house. Therefore:

       nums[i] + dp[i-2]

2. **Skip the current house**  
   In this case, the maximum amount remains the same as the previous house:

       dp[i-1]

So the recurrence is:

    dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1])

The `dp[i]` array stores the maximum amount that can be robbed from the first `i + 1` houses.

### Base Cases

For the first house:

    dp[0] = nums[0]

For the second house, I can only rob the house with the larger amount:

    dp[1] = Math.max(nums[0], nums[1])

After initializing these values, I calculate the remaining positions using the recurrence above.

---

## 🔍 Example Walkthrough

For:

    nums = [2, 7, 9, 3, 1]

The DP array is calculated as:

    dp[0] = 2

    dp[1] = max(2, 7) = 7

    dp[2] = max(9 + 2, 7) = 11

    dp[3] = max(3 + 7, 11) = 11

    dp[4] = max(1 + 11, 11) = 12

Therefore:

    Output = 12

---

## ⏱️ Complexity Analysis

**Time Complexity:** O(n)

The array is traversed only once.

**Space Complexity:** O(n)

An additional `dp` array is used to store the maximum amount for each position.

---

## 🔄 Space-Optimized Approach

The same problem can also be solved using only two variables instead of the entire `dp` array.

The idea is to keep track of:

- `previousLoot` → maximum loot from two houses back
- `currentLoot` → maximum loot from the previous house

The commented Method 1 in `Code.java` demonstrates this approach.

This reduces the space complexity from:

    O(n) → O(1)

while keeping the time complexity at:

    O(n)

---

## 🧠 Key Learning

- Understanding the basic pattern of Dynamic Programming
- Making a choice between taking and skipping an element
- Building a DP solution using previous results
- Understanding how the same DP problem can be space-optimized
- Recognizing the recurrence:

      max(current + previous two, previous one)