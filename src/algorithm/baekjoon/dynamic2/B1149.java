package algorithm.baekjoon.dynamic2;

import java.util.Scanner;

public class B1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][4];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 4; j++) {
                dp[i][j] = sc.nextInt();
            }
        }

        for (int i = 2; i <= n; i++) {
            dp[i][1] += Math.min(dp[i-1][2], dp[i-1][3]);
            dp[i][2] += Math.min(dp[i-1][1], dp[i-1][3]);
            dp[i][3] += Math.min(dp[i-1][1], dp[i-1][2]);
        }

        int min = 1000*1000;
        for (int i = 1; i < 4; i++) {
            min = Math.min(min, dp[n][i]);
        }
        System.out.println(min);
    }
}
