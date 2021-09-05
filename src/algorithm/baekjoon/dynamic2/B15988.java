package algorithm.baekjoon.dynamic2;

import java.util.Scanner;

public class B15988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dp = new int[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 1000001; i++) {
            dp[i] = ((dp[i-3] + dp[i-2]) % 1000000009 + dp[i-1]) % 1000000009;
        }

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}
