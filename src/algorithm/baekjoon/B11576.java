package algorithm.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B11576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int size = sc.nextInt();
        // 1. A진법 -> 10진법
        int tmp = 0; //A진법을 10진법으로 바꾼 숫자
        int idx = size-1; //승수
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            tmp += num * Math.pow(a, idx--);
        }
        // 2. 10진법 -> B진법
        Stack<Integer> stack = new Stack<>();
        while (tmp!=0){
            stack.push(tmp%b);
            tmp /= b;
        }
        // 3. 결과 출력
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}
