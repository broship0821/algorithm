package algorithm.이코테.dynamicPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05_금광 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //금 위치 배열
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //각 위치에 최고값을 기록할 dp 배열
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            dp[i][0] = arr[i][0];//제일 좌측은 더할 값이 없어서 이미 최고값
        }
        //dp[i][j] = arr[i][j] + max(dp[i-1][j-1], dp[i][j-1], dp[i+1][j-1])
        for (int j = 1; j < m; j++) {//행보다 열을 먼저 집어넣어야 하기 때문에 m먼저
            for (int i = 0; i < n; i++) {
                if (i==0)//맨 위일때 더이상 위로 올라갈 수 없음
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j-1], dp[i+1][j-1]);
                else if (i==n-1)//맨 아래일때 더이상 아래로 내려갈 수 없음
                    dp[i][j] = arr[i][j] + Math.max(dp[i-1][j-1], dp[i][j-1]);
                else//중간일때는 상중하 어디서든 올수있음
                    dp[i][j] = arr[i][j] + Math.max(Math.max(dp[i-1][j-1], dp[i][j-1]), dp[i+1][j-1]);
            }
        }
        //맨 마지막 열 중 가장 큰 값이 정답
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, dp[i][m-1]);
        }
        System.out.println(result);
    }
}
