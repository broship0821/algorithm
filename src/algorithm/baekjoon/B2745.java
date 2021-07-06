package algorithm.baekjoon;

import java.util.Scanner;
//아예 틀림, 처음부터 다시 풀기
public class B2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();

        long result = 1;
        for (int i = n.length()-1; i >= 0; i--) {
            int num = n.charAt(i) - 55 + 1;
            result *= num;
        }
        System.out.println(result-1);
    }
}
