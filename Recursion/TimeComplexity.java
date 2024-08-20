package Recursion;

public class TimeComplexity {
}
// time complexity - it's a function that gives us the relationship about how the time will grow as the input grows
// linear search grows linearly (n) and binary search grows exponentially (logn)

// HOW TO DERIVE COMPLEXIRY?
// 1. always look for worst case complexity
// 2. always look at complexity for large data
// 3. y=x, y=2x, y=3x, y=4x (ignore the constants)
// eventhough value of the actual time is different they are all growing linearly(we don't care about the actual time).
// 4. always ignore the less dominating terms
// O(3N^3 + 4N^2 + 5N + 6) = O(N^3 + N^2 + N) = O(N^3)
// O(1) < O(log(N)) < O(N) < O(N(log(N))) < O(2^n)   : SOME TIME COMPLEXITY ORDERS

// O(N^3) MEANING: it's the upper bound of time complexity and time complexity can't be greater than this (N^3).

// omega(N^3) MEANING: it's the lower bound of time complexity and time complexity can't be smaller than this (N^3).


// TIME COMOPLEXITY OF RECURSIVE PROGRAMS

//space complexity : in the case of finding Nth fobonacci number, it is equal to the height of the recursive tree O(N).
