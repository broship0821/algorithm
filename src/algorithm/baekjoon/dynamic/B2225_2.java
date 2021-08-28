package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B2225_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] dp = new int[201][201];

        // k=1, 정수 1개만으로 i를 만들어야 할때 무조건 1가지 경우밖에 없음
        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;
        }
        // n=1, 정수 j개로 1을 만드려면
        // 1: 1
        // 2: 1+0, 0+1
        // 3: 1+0+0, 0+1+0, 0+0+1
        // .... i개만큼의 경우가 있음
        for (int j = 1; j <= k; j++) {
            dp[1][j] = j;
        }

        //dp[n][k] = dp[n-1][k] + dp[n][k-1]
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= k; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000000;
            }
        }

        System.out.println(dp[n][k]);
    }
}
