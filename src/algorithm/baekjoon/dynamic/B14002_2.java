package algorithm.baekjoon.dynamic;

import java.util.Scanner;
import java.util.Stack;

public class B14002_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i : dp){
            max = Math.max(max, i);
        }
        System.out.println(max);

        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            if (dp[i] == max){
                stack.push(arr[i]);
                max--;
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
