package algorithm.baekjoon;

import java.util.Scanner;

public class B1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] sosu = new boolean[1001];
        sosu[0] = true;
        sosu[1] = true;
        for (int i = 2; i <= Math.sqrt(1000); i++) {
            if (sosu[i]) continue;
            for (int j = i*i; j <= 1000; j+=i) {
                sosu[j] = true;
            }
        }

        int cnt = 0;
        for (int i : arr){
            if (!sosu[i])
                cnt++;
        }
        System.out.println(cnt);
    }
}
