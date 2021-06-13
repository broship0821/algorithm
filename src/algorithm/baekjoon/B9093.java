package algorithm.baekjoon;

import java.util.Scanner;

public class B9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String[] results = new String[t]; // 결과를 담을 배열

        for (int i = 0; i < t; i++) {
            String word = sc.nextLine();
            String[] wordArr = word.split(" ");
            StringBuilder result = new StringBuilder();
            for (String words : wordArr) {
                for (int j = words.length(); j > 0; j--) {
                    result.append(words.charAt(j-1));
                }
                result.append(" ");
            }
            results[i] = result.toString();
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
