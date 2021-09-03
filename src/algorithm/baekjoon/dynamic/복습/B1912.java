package algorithm.baekjoon.dynamic.복습;

import java.util.Scanner;

public class B1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n];
        int max = dp[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            dp[i] = sc.nextInt();
            dp[i] = Math.max(dp[i], dp[i-1] + dp[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
