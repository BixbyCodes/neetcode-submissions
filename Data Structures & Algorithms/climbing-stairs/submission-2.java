class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
      return  helper(n,dp,0);
    }
    public int helper(int n, int[] dp , int i){
       if (i > n) {
        return 0;
    }
    
    if (n == 1 || n == 0) {
        return 1;
    }
    if (i == n) {
        return 1;
    }
    if (dp[i] != -1) {
        return dp[i];
    }
         
       int a =  helper(n,dp,i+1);
      int b =   helper(n,dp,i+2);
     dp[i]=a+b;
      return dp[i];

    }
}
