package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B11053_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1; //dp 배열 1로 초기화
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j])//i번째 숫자가 j번째 숫자보다 큰 경우에만 dp 배열을 비교해본다
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    //dp[i] : 현재 i번째 까지 가장 긴 수열 길이
                    //dp[j] + 1 : j번째 까지 가장 긴 수열 길이에 i를 추가한 수열의 길이
                    //위 2개중 더 긴 값을 dp에 담는다
            }
        }
        //dp 중 가장 큰 값이 가장 긴 수열의 길이
        int result = 0;
        for (int i : dp)
            result = Math.max(result, i);
        System.out.println(result);
    }
}
