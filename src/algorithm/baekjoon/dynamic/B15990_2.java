package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B15990_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //i를 만들 수 있는 것 중 1로 끝나는것, 2로 끝나는것, 3으로 끝나는걸 각각 2차원 배열에 담는다
        int[][] dp = new int[100001][4];

        dp[1][1] = 1; // 1
        dp[1][2] = 0;
        dp[1][3] = 0;

        dp[2][1] = 0;
        dp[2][2] = 1; // 2
        dp[2][3] = 0;

        dp[3][1] = 1; // 2+1
        dp[3][2] = 1; // 1+2
        dp[3][3] = 1; // 3

        for (int i = 4; i <= 100000; i++) {
            // i-1을 만들 수 있는 숫자 중 맨 끝이 2 or 3인것
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
            // i-2를 만들 수 있는 숫자 중 맨 끝이 1 or 3인것
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
            // i-3을 만들 수 있는 숫자 중 맨 끝이 1 or 2인것
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;
        }
        int t = sc.nextInt();
        //n을 만들기 위한 총 숫자 개수 = 1로 끝나는것 + 2로 끝나는것 + 3으로 끝나는것
        for (int i = 0; i < t; i++) {
            int n= sc.nextInt();
            int sum = 0;
            sum +=dp[n][1];
            sum%=1000000009;
            sum+=dp[n][2];
            sum%=1000000009;
            sum+=dp[n][3];
            sum%=1000000009;
            System.out.println(sum);
        }
    }
}
