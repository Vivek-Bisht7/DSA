//Top down approach

class Solution {
    public int solve(int n , int[] dp){
        if(n==0 || n==1) return 1;

        if(dp[n] != -1) return dp[n];

        dp[n] = solve(n-1,dp) + solve(n-2,dp);

        return dp[n];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return solve(n,dp);
    }
}

// Bottom up approach

class Solution {
    public int solve(int n , int[] dp){
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 1;
        dp[1] = 1;

        return solve(n,dp);
    }
}

//space optimisation

class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;

        int a = 1, b = 1 , c = 0;

        for(int i=2; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }

        return c;

    }
}