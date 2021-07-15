package algorithm.이코테.dynamicPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_금광 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            //dp 테이블 초기화
            int[][] dp = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    dp[j][k] = sc.nextInt();
                }
            }
            //다이나믹 프로그래밍
            int leftUp = 0;
            int leftDown = 0;
            int left = 0;
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    //왼쪽 위에서 오는 경우
                    if (k==0) leftUp = 0;
                    else leftUp = dp[k-1][j-1];
                    //왼쪽 아래에서 오는 경우
                    if (k==n-1) leftDown = 0;
                    else leftDown = dp[k+1][j-1];
                    //왼쪽에서 오는 경우
                    left = dp[k][j-1];
                    dp[k][j] = dp[k][j] + Math.max(leftUp, Math.max(leftDown, left));
                }
            }
            int result = 0;
            for (int j = 0; j < n; j++) {
                result = Math.max(result, dp[j][m-1]);
            }
            System.out.println(result);
        }
    }
}
