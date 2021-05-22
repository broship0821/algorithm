package algorithm.baekjoon;

import java.util.Scanner;

public class S4_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //에라테네시의체로 소수 먼저 구하기
        boolean[] arr = new boolean[m+1];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (arr[i])
                continue;
            for (int j = i*i; j < m+1; j+=i) {
                arr[j] = true;
            }
        }

        // 소수의 합
        int sum = 0;
        for (int i = n; i <= m; i++) {
            if (!arr[i])
                sum += i;
        }
        if (sum==0)//소수가 없을 경우 -1 출력
            System.out.println(-1);
        else {
            System.out.println(sum);
            // 최소값
            for (int i = n; i <= m; i++) {
                if (!arr[i]){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
