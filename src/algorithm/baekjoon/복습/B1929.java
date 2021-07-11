package algorithm.baekjoon.복습;

import java.util.Scanner;

//소수구하기
public class B1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] sosu = new boolean[n+1];
        sosu[0] = true;
        sosu[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (sosu[i]) continue;
            for (int j = i*i; j < n+1; j+=i) {
                sosu[j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (!sosu[i])//false면 소수
                System.out.println(i);
        }
    }
}
