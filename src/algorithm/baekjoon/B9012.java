package algorithm.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            Stack<Character> stack = new Stack<>(); //괄호를 담을 스텍
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)=='(') stack.push('('); //여는 괄호 넣기
                else
                    if (stack.empty()){ //닫는 괄호가 더 많을 경우
                        System.out.println("NO");
                        flag = false; //이미 판별이 난 경우 괄호 개수 맞는지 체크 불필요
                        break;
                    } else
                        stack.pop();
            }
            if (flag) //괄호 개수 맞는지 체크
                if (stack.empty()) System.out.println("YES"); //괄호 개수가 맞음
                else System.out.println("NO"); //여는 괄호가 더 많을 경우
        }
    }
}
