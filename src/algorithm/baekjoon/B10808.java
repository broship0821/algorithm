package algorithm.baekjoon;

import java.util.Scanner;

public class B10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] cnt = new int[26];

        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i)-'a']++;
        }

        for (int i : cnt) {
            System.out.print(i + " ");
        }
    }
}
