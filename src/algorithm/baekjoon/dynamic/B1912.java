package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        // 맨 첫번째 숫자의 연속합은 자기 자신
        int max = dp[0] = arr[0];
        //dp 배열에 i번째 연속합 중 가장 큰 값을 넣는다
        for (int i = 1; i < n; i++) {
            //i-1까지 연속합 + i번째 숫자 or i번째 숫자 중 가장 큰 값이 dp[i]
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            //dp 배열 중 가장 큰 값을 기록해둔다(연속합 중 가장 큰 값)
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
