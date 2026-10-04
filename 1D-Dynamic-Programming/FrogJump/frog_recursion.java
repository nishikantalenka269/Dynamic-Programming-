class Solution {
    // Recurion Approach 
    // Time Complexity : O(2^n)
    // Space Complexity : O(n)
    private int  helper (int idx , int [] height){
        if (idx == 0) return 0;
        int onestep = helper(idx-1 , height) + Math.abs(height[idx]-height[idx-1]);
        if (idx == 1) return Math.abs(height[1] - height[0]);
        int twostep = helper(idx-2 , height) + Math.abs(height[idx]-height[idx-2]);
        return Math.min(onestep , twostep);
    }
    int minCost(int[] height) {

        int n = height.length ; 
        return helper(n-1 , height);

    }
}
