package algorithm.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int b = sc.nextInt();
        //0~35 범위에 있는 두자리 숫자가 나올 수 있으니 StringBuilder보다는 stack 사용
        Stack<Long> stack = new Stack<>();
        while (n!=0){//진수 구하기
            stack.push(n%b);
            n /= b;
        }
        //두자리수는 영어 알파벳으로 치환해서 출력
        while (stack.size()!=0){
            long num = stack.pop();
            if (num < 10)
                System.out.print(num);
            else
                System.out.print((char)(num+55));
        }
    }
}
