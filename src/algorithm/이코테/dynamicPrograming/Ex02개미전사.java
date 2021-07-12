package algorithm.이코테.dynamicPrograming;

import java.util.Scanner;

public class Ex02개미전사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //앞서 계산된 결과를 저장하는 dp 테이블
        int[] dp = new int[n];
        //f(i) = max(f(i-1), f(i-2) + k(i))
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + arr[i]);
        }
        System.out.println(dp[n-1]);
    }
}
