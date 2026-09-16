# Design HashSet

## 📌 Problem Statement

Design a HashSet without using any built-in hash table libraries.

Implement the following operations:

- `add(key)` - Adds the key to the HashSet.
- `remove(key)` - Removes the key from the HashSet.
- `contains(key)` - Checks whether the key exists in the HashSet.

The keys are non-negative integers within a fixed range.

---

## Difficulty

🟢 Easy

---

## Topic

- HashSet
- Array
- Direct Addressing

---

## 💡 Approach

Since the key range is limited from `0` to `1,000,000`, I used a boolean array to represent the HashSet.

The array index represents the key:

- `true` means the key is present.
- `false` means the key is not present.

For example:

```text
data[5] = true  →  Key 5 is present
data[5] = false →  Key 5 is not present