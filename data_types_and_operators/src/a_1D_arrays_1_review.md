# Documentation for data_types_and_operators/src/a_1D_arrays_1.java

## Code Review

Hey there,

Looks like you left a 'TODO' comment right above your for loop that's printing the array elements but didn't specify what you need help with.

Here's your code:
```java
    // print
    for (int i = 0; i < 3; i++) { // TODO
        System.out.println("this is arrary [" + i + "]: " + a1[i]);
    }
```
If this 'TODO' is either for error checking or improving the loop structure, a better way would be to get the length of the array dynamically, so that it works well even if the array size changes, like so:
```java
    // print
    for (int i = 0; i < a1.length; i++) {
        System.out.println("this is array [" + i + "]: " + a1[i]);
    }
```
Please clarify what problem you're facing, or improvements you want to make so we can be of better assistance. Keep coding, practice makes perfect!