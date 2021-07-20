package algorithm.baekjoon.dynamic;

import java.util.Scanner;
//피보나치 수열
public class B11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //dp 배열의 크기는 n+1
        int[] dp = new int[n+1];
        //0,1 은 1로 초기화
        dp[0] = 1;
        dp[1] = 1;
        //2부터 dp[i] = dp[i-1] + dp[i-2]로 dp 배열 채우기
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 10007;//int에 담을 수 있게 10007로 나머지 연산 수행하는듯
        }
        //dp 배열의 n번째 수가 최대 만들 수 있는 횟수
        System.out.println(dp[n]);
    }
}
