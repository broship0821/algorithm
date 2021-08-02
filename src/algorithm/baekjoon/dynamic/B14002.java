package algorithm.baekjoon.dynamic;

import java.util.*;

public class B14002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // dp 배열 구하기
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        // 가장 긴 수열 길이 구하기(max)
        int max = 0;
        for (int i : dp){
            max = Math.max(max, i);
        }
        System.out.println(max);
        //배열 역추적
        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            if (max==dp[i]){
                stack.push(arr[i]);
                max--;
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
