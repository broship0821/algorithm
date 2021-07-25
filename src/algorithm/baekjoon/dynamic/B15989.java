package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B15989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] dp = new int[100001][4];
        dp[1][1] = 1;
        dp[1][2] = 0;
        dp[1][3] = 0;

        dp[2][1] = 0;
        dp[2][2] = 1;
        dp[2][3] = 0;

        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i < 100001; i++) {
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;
        }

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-- >0) {
            int sum = 0;
            int n= sc.nextInt();
            sum +=dp[n][1];
            sum%=1000000009;
            sum+=dp[n][2];
            sum%=1000000009;
            sum+=dp[n][3];
            sum%=1000000009;
            sb.append(sum+"\n");
        }
        System.out.println(sb);
    }
}
