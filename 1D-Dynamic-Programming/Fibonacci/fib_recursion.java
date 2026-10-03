class Solution {
    // Recursion accepted solution - Time complexity : O(2^n) and Space Complexity : O(n) for Stack  
    public int fib(int n) {
        if (n <= 1) return n ;
        return fib(n-1) + fib (n-2);
    }
}
