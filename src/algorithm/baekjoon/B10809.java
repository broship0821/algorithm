package algorithm.baekjoon;

import java.util.Scanner;

public class B10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] idxArr = new int[26];

        for (int i = 0; i < 26; i++) {
            idxArr[i] = str.indexOf('a'+i);
        }

        for (int i : idxArr) {
            System.out.print(i + " ");
        }
    }
}
