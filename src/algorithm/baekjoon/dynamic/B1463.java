package algorithm.baekjoon.dynamic;

import java.util.Scanner;

public class B1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //f(x)는 x를 1로 만들기 위한 최소 연산 횟수
        //f(x) = min(f(x-1), f(x/2), f(x/3)) + 1
        //1을 빼는 연산을 제외한 나누기 연산들은 나누어 떨어질때만 포함될수 있음

        int[] dp = new int[1000001];
        for (int i = 2; i <= x; i++) {
            //현재 수에서 1을 빼는 경우
            int min = dp[i-1] + 1;
            //현재 수에서 2로 나누어 떨어지는 경우
            if (i%2 == 0) min = Math.min(min, dp[i/2]+1);
            //현재 수에서 3로 나누어 떨어지는 경우
            if (i%3 == 0) min = Math.min(min, dp[i/3]+1);
            dp[i] = min;
        }
        System.out.println(dp[x]);
    }
}
