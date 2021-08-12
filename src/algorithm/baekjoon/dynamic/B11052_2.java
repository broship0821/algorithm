package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B11052_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; i++) {
            //i개가 들은 팩을 살때
            dp[i] = sc.nextInt();
            //반복문을 돌며 dp[i-j] + dp[j] 의 값중 가장 큰 값을 dp에 저장한다
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i-j] + dp[j]);
            }
        }
        System.out.println(dp[n]);
    }
}
