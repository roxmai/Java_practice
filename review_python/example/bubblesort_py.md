# Documentation for python/example/bubblesort.py

## Code Review

Sure, I can help you build that. Here's a basic implementation of a bubble sort algorithm in Python:

```python
def bubble_sort(numbers):
    n = len(numbers)
    
    for i in range(n):
        for j in range(0, n-i-1): 

            # Create a swap if the current element is larger than the next
            if numbers[j] > numbers[j+1]:
                numbers[j], numbers[j+1] = numbers[j+1], numbers[j]

numbers = [64, 34, 25, 12, 22, 11, 90]
bubble_sort(numbers)

print(f"Sorted array is: {numbers}")
```
Reminder — Bubble sort isn't the most efficient sorting algorithm with worst case and average time complexity of O(n^2), where n is the number of items being sorted. For small lists or for teaching purposes, it's fine. But for larger lists, you should consider other algorithms (like quicksort, mergesort etc.). Always aim for better ways of implementing algorithms. Keep rocking! 🎸