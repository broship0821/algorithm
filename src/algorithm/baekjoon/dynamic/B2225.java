package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B2225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] dp = new long[201][201];

        for (int i = 1; i <= 200; i++) {
            dp[i][0] = 1; //i개를 가지고 0을 만들때 0, 0+0, 0+0+0... 무조건 1개
            dp[1][i] = 1; //1개를 가지고 i를 만들때 0, 1, 2, 3, 4... 무조건 1개
            dp[2][i] = i+1; //2개를 가지고 i를 만들때 0+i, 1+(i-1), 2+(i-2)... i+0 이렇게 0~i까지 총 i+1개
        }

        for (int i = 3; i <= 200; i++) {
            for (int j = 1; j <= 200; j++) {
                for (int l = 0; l <= j; l++) {
                    dp[i][j] += dp[i-1][j-l] % 1000000000;
                    //i개를 가지고 j를 만들때는
                    //0~j까지 i-1개를 가지고 만들수 있는 모든 수를 더한값
                }
            }
        }
        System.out.println(dp[k][n] % 1000000000);
    }
}
