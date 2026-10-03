class Solution {
    // Recusion approach
    // Time Complexity : O(2^n) and Space Complexity : O(n)
    public int climbStairs(int n) {
        if (n <= 1) return 1 ;
        int step1 = climbStairs(n-1);
        int step2 = climbStairs(n-2);
        return step1 + step2 ; 
    }
}
