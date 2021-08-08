package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B1463_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + 1; // -1 연산
            if (i%2==0) dp[i] = Math.min(dp[i], dp[i/2] + 1); // /2 연산
            if (i%3==0) dp[i] = Math.min(dp[i], dp[i/3] + 1); // /3 연산
        }
        System.out.println(dp[n]);
    }
}
