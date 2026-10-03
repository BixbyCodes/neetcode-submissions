class Solution {
    public double new21Game(int n, int k, int maxPts) {
        double[] dp = new double[n+1];
        Arrays.fill(dp,-1);
        return helper(n,k,maxPts,dp,0);

    }
    public double helper(int n, int k, int maxPts, double[] dp, int points) {

 if (points >= k) {
        return points <= n ? 1.0 : 0.0;
    }

    if (dp[points] != -1) {
        return dp[points];
    }

 double probability = 0;

    for (int draw = 1; draw <= maxPts; draw++) {
        probability += helper(n, k, maxPts, dp, points + draw);
    }

    dp[points] = probability / maxPts;

    return dp[points];
}
}