class Solution {
     // Tabulation Approach / Buttom - Up appraoch
     // Time Complexity : O(n)
     // Space Complexity : O(n)
    int minCost(int[] height) {
        int n = height.length;
        if (n == 1) return 0;
        int [] dp = new int [n+1];
        dp[0] = 0;
        dp[1] = Math.abs(height[0]-height[1]);
        for (int i = 2 ; i < n ; i++){
            int oneStep = dp[i-1] + Math.abs(height[i]-height[i-1]);
            int twoStep = dp[i-2] + Math.abs(height[i]-height[i-2]);
            dp[i] = Math.min(oneStep,twoStep);
        }
        return dp[n-1];
    }
}
