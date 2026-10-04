class Solution {
    // Memoization Approach / Top Down Approach 
    // Time Complexity : O(n)
    // Space Complexity : O(2n) 
    private int [] dp;
    private int helper(int idx , int [] height){
        if (idx == 0) return  0;
        if (idx == 1) return Math.abs(height[1] - height[0]);
        if (dp[idx] != -1) return dp[idx];
        int oneStep = helper(idx-1 , height) + Math.abs(height[idx]-height[idx-1]);
        int twoStep = helper(idx-2 , height) + Math.abs(height[idx]-height[idx-2]);
        return dp[idx] = Math.min(oneStep ,twoStep);
    }
    int minCost(int[] height) {
        int n = height.length;
        dp = new int [n+1];
        Arrays.fill(dp , -1);
        return helper(n-1 , height);
    }
}
