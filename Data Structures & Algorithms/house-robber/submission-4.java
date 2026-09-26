class Solution {
    public int rob(int[] nums) {
   
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int i = 0;

        return helper(nums,dp,0);
    }
    public int helper(int[]nums,int [] dp ,int i){
if(i>nums.length-1){
    return 0;
}

if(dp[i]!=-1){
    return dp[i];
}
int take = nums[i]+helper(nums,dp,i+2);
int skip  = helper(nums,dp,i+1);
dp[i]= Math.max(take,skip);
return dp[i];
    }
}
