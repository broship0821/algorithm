package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B16194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            dp[i] = 10001;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.min(dp[i], arr[j] +dp[i-j]);
            }
        }
        System.out.println(dp[n]);
    }
}