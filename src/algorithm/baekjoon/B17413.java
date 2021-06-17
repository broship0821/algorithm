package algorithm.baekjoon;

import java.util.Scanner;

public class B17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //문자열 s 입력받기
        String s = sc.nextLine();
        //태그 먼저 검사
        //indexOf로?
        String[] wordArr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : wordArr) {
            for (int j = word.length(); j > 0; j--) {
                result.append(word.charAt(j-1));
            }
            result.append(" ");
        }
    }
}
