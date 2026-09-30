
In this assignment, I worked with three algorithms: Recursive Fibonacci, Iterative Binary Search, and Recursive Binary Search.

**1. Recursive Fibonacci**

First, I used the Fibonacci function with recursion. The function calls itself two times: `fibonacci(n - 1)` and `fibonacci(n - 2)`. It stops when `n` is 0 or 1. For example, `fibonacci(4)` gives 3, `fibonacci(5)` gives 5, and `fibonacci(6)` gives 8.

The recursive calls make a tree. For example, `fibonacci(4)` calls `fibonacci(3)` and `fibonacci(2)`. Then these functions call other Fibonacci functions until they reach 0 or 1.

**2. Iterative Binary Search**

Next, I used Iterative Binary Search. The array must be sorted. In my example, the array is `[1, 3, 5, 7, 9, 11, 13]`.

The algorithm uses `low`, `high`, and `mid`. In every iteration, it checks the middle element. If the target is bigger than the middle element, the search continues in the right part. If the target is smaller, it continues in the left part. This makes the search area smaller after every iteration.

For example, when searching for 11, the first middle element is 7. Because 11 is bigger than 7, I search in the right part. Then I find 11 at index 5.

**3. Recursive Binary Search**

Finally, I used Recursive Binary Search. It works almost the same as Iterative Binary Search, but instead of a loop, it uses recursive function calls.

The function checks the middle element. If the target is not there, it calls itself again with the left or right part of the array. For example, when searching for 11, it first checks 7, then searches the right part and finds 11.

When the target is not in the array, the function returns `-1`.


In these three examples, I learned how recursion works and how Binary Search reduces the search area. Recursive algorithms call themselves, while the iterative algorithm uses a loop. Binary Search is fast because it removes half of the search area in each step.
