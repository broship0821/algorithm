package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B11726_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[1] = 1;
        if (n>1) dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
            dp[i] %= 10007;
        }
        System.out.println(dp[n] % 10007);
    }
}
