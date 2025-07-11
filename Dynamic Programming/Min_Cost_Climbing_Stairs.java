//tutor => Rohit Negi
//top down approach

class Solution {
    public int solve(int n , int[] cost , int[] dp){
        if(n<=1) return 0;
        if(dp[n] != -1) return dp[n];

        return dp[n] = Math.min(cost[n-1]+solve(n-1,cost,dp),cost[n-2]+solve(n-2,cost,dp));
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        return solve(cost.length,cost,dp);

    }
}

//Bottom up
class Solution {
    public int solve(int n , int[] cost , int[] dp){
        for(int i=2; i<=n; i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 0;
        return solve(cost.length,cost,dp);

    }
}

//space-optimisation

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n == 1) return cost[0];
        
        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = current;
        }

        return Math.min(prev1, prev2);
    }
}