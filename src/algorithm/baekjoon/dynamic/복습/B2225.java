package algorithm.baekjoon.dynamic.복습;

import java.util.Scanner;

public class B2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] dp = new int[n+1][k+1];
        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;
        }
        for (int i = 1; i <= k; i++) {
            dp[1][i] = i;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000;
            }
        }
        System.out.println(dp[n][k] % 1000000000);
    }
}
