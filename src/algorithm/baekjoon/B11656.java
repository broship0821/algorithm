package algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int size = str.length();
        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            arr[i] = str.substring(i, size);
        }
        Arrays.sort(arr);
        for (String s : arr){
            System.out.println(s);
        }
    }
}
