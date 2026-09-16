# Design HashMap

## 📌 Problem Statement

Design a HashMap without using any built-in hash table libraries.

Implement the following operations:

- `put(key, value)` - Stores the key-value pair in the HashMap.
- `get(key)` - Returns the value associated with the key, or `-1` if the key does not exist.
- `remove(key)` - Removes the key and its associated value from the HashMap.

---

## Difficulty

🟢 Easy

---

## Topic

- HashMap
- Array
- Direct Addressing

---

## 💡 Approach

Since the key range is limited from `0` to `1,000,000`, I used an integer array to store the values directly using the key as the array index.

Initially, every position in the array is filled with `-1`, which represents that the key does not exist.

For example:

```text
data[5] = 100  →  Key 5 has value 100
data[5] = -1   →  Key 5 does not exist