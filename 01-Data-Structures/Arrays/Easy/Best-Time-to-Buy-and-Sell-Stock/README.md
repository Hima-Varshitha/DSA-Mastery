# Best Time To Buy And Sell Stock

## 📌 Problem Statement

You are given an array `prices` where:

- `prices[i]` represents the price of a stock on the ith day.

You need to find the maximum profit you can achieve by choosing:
- One day to buy the stock.
- A later day to sell the stock.

Return the maximum profit.

---

## Difficulty

🟢 Easy

---

## Platform

LeetCode

---

## Topic

- Array
- Greedy Algorithm
- One Pass Technique

---

# 💡 Approach

## One Pass Algorithm

The main idea is:

- Track the minimum price seen so far.
- Calculate the profit if we sell on the current day.
- Keep updating the maximum profit.

For every price:

1. Update minimum buying price.
2. Calculate current profit:

```
current price - minimum price
```

3. Update maximum profit.

---

# Example

Input:

```
prices = [7,1,5,3,6,4]
```

Explanation:

Buy on day 2:

```
Price = 1
```

Sell on day 5:

```
Price = 6
```

Profit:

```
6 - 1 = 5
```

Output:

```
5
```

---

# Algorithm

1. Initialize:
   - `min = Integer.MAX_VALUE`
   - `profit = 0`

2. Traverse through the prices array.

3. Store the minimum price encountered.

4. Calculate possible profit for each day.

5. Store maximum profit.

6. Return the result.

---

# Complexity Analysis

## Time Complexity

```
O(n)
```

The array is traversed only once.

## Space Complexity

```
O(1)
```

Only constant extra variables are used.

---

# Key Learning

This problem demonstrates:

✅ Array traversal  
✅ Greedy approach  
✅ Maintaining optimal values during iteration  
✅ Reducing brute force O(n²) solution to O(n)

---

# Related Concepts

- Kadane's Algorithm
- Maximum Subarray Pattern
- Greedy Optimization