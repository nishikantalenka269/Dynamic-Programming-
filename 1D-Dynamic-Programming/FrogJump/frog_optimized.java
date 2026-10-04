class Solution {
     // Optimized Approach
     // Time Complexity : O(n)
     // Space Complexity : O(1)
    int minCost(int[] height) {
        int n = height.length;
        if (n == 1) return 0;
        int prev2 = 0;
        int prev1 = Math.abs(height[0]-height[1]);
        int curr = -1 ;
        for (int i = 2 ; i < n ; i++){
            int oneStep = prev1 + Math.abs(height[i]-height[i-1]);
            int twoStep = prev2 + Math.abs(height[i]-height[i-2]);
            curr= Math.min(oneStep,twoStep);
            
            prev2 = prev1 ;
            prev1 = curr ;
        }
        return prev1;
    }
}
