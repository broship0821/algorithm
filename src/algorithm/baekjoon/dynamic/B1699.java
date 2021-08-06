package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B1699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i;//어떤 수든 1^2 + 1^2..... i개가 될 수 있다
            for (int j = 1; j*j <= i; j++) {//i보다 작은 제곱수들 비교
                //그중에서 가장 작은 값을 구한다
                dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}
