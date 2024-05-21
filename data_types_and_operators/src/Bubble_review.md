# Documentation for data_types_and_operators/src/Bubble.java

## Code Review

Everything seems correct in your code. This pattern is a well-known implementation of the Bubble Sort in Java.

For this bit:
```java
for (b = size - 1; b >= a; b--) { // TODO: help me check if this is correct
```

Indeed, it is correct. We start `b` with the last index of the array (`size - 1`) and keep. The inner loop allows you to review the array from high towards low indices until you reach `a`. That's because after each full pass, the next largest element will have moved to the rightmost in remaining unsorted list, hence no need to continue to double steps back right through sorted series.  

And derive inspiration to keep coming up with faultless code, Tip Top!