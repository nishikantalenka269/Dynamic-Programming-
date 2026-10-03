class Solution {
    // Memoization Aproach (top-down)
    // Time Complexity :  O(n)
    // Space Complexity : O(n) + O(n) 
    private int [] dp ;
    private int helper(int n){
        if (n <= 1) return 1 ;
        if (dp[n] != -1) return dp[n];
        return dp[n] = helper(n-1) + helper(n-2);
    }
    public int climbStairs(int n) {
        dp = new int [n+1];
        Arrays.fill(dp,-1);
        return helper(n);
    }
}
