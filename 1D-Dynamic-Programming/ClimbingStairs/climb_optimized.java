class Solution {
    // Buttom - up with constant space complexity
    // Time complexity : O(n)
    // Space Complexity : O(1)
    public int climbStairs(int n) {
        if (n == 0 || n == 1 ) return 1 ;
        int step1 = 1 ;
        int step2 = 1 ;
        int curr = -1 ;
       for (int i = 2 ; i<= n ; i++){
          curr = step1 + step2 ;
          step2 = step1 ;
          step1 = curr ;
       }
       return step1;
    }
}
