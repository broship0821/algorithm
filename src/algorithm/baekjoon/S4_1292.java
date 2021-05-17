package algorithm.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S4_1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // 수열을 담을 배열
        List<Integer> list = new ArrayList<>();
        // max가 1000이므로 넉넉히 50까지 수열을 구한다
        for (int i = 1; i < 50; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }
        // a~b 사이의 합 구하기
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += list.get(i-1);
        }
        System.out.println(result);
    }
}
