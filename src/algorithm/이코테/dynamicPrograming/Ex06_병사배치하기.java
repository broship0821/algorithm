package algorithm.이코테.dynamicPrograming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex06_병사배치하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        //순서를 뒤집어 최장 증가 부분 수열 문제로 변환
        Collections.reverse(arr);
        //숫자 하나일때 최장 길이는 1
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        //arr[j] < arr[i]일때 dp[i]와 dp[j]+1을 비교해서 큰 값을 dp[i]에 삽입
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i))
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }
        //dp 배열중 가장 큰 값이 가장 긴 수열의 길이, n-result는 빼야하는 숫자의 개수
        int result = 0;
        for (int i : dp)
            result = Math.max(result, i);
        System.out.println(n - result);
    }
}
