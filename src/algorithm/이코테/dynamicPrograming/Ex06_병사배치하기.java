package algorithm.이코테.dynamicPrograming;

import java.util.Scanner;

public class Ex06_병사배치하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i+1]) cnt++;
        }
        System.out.println(cnt);
    }
}
