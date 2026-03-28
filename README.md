# DSA
This repository contains my daily practice of Data Structures and Algorithms problems, including optimized solutions and approaches aimed at strengthening problem-solving and coding skills for technical interviews


Progress Day 1
>> Simple java program which prints hello world


Progress Day 2
>> # 🔢 Two Sum Problem (Java)

## 📌 Overview
This project implements the classic **Two Sum problem** using Java.

The goal is to find **two numbers in an array** such that they add up to a given target value and return their **indices**.
------------------------
## 🚀 Problem Statement
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that:

nums[i] + nums[j] = target

- Each input has exactly one solution.
- You may not use the same element twice.
------------------------
## 💡 Approach (Optimized - HashMap)

We use a **HashMap** to store elements and their indices while iterating.

### Steps:
1. Loop through the array
2. For each element, calculate:



Progress Day 3
>> # 🔍 Contains Duplicate (Java)

## 📌 Problem
Given an integer array `nums`, return `true` if any value appears at least twice, otherwise return `false`.
---------------
## 💡 Approach
We use a **HashSet** to track elements:

- Traverse the array
- If element already exists in the set → duplicate found → return `true`
- Else add element to the set
- If no duplicates → return `false`
----------------
## 🧠 Complexity
- Time: O(n)
- Space: O(n)
----------------
## ▶️ How to Run
```bash
javac ContainsDuplicate.java  
java ContainsDuplicate
