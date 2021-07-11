package algorithm.이코테.dynamicPrograming;

import java.util.Scanner;

public class Ex01피보나치수열_bottom_up {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= x; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(arr[x]);
    }
}
