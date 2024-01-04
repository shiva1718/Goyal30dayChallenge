package goldmanSachs.waysToReach;

import java.util.Arrays;

class Solution {

    public int numberOfWays(int startPos, int endPos, int k) {
        int[][] dp = new int[2 * k][k + 1];
        for (int[] ints : dp) Arrays.fill(ints, -1);
        return rec(k, k + endPos - startPos, k, k, dp);
    }

    public int rec(int start, int end, int cur, int k, int[][] dp) {
        if (cur > 2 * start) return 0;
        if (k == 0) {
            if (cur == end) {
                return 1;
            }
            return 0;
        }
        if (dp[cur][k] != -1) return dp[cur][k];
        long left = rec(start, end, cur + 1, k - 1, dp);
        long right = rec(start, end, cur - 1, k - 1, dp);
        return dp[cur][k] = (int) ((left + right) % 1000000007);
    }
}