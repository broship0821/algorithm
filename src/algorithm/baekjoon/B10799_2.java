package algorithm.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B10799_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Stack<Character> stack = new Stack<>();//놓여진 쇠막대기 개수
        int cnt = 0;//총 쇠막대기 개수

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='('){//여는 괄호일때 쇠막대기 추가
                stack.push('(');
            } else {//닫는 괄호일때
                stack.pop();//우선 하나 꺼냄
                if (input.charAt(i-1)=='(')//레이저일때
                    cnt += stack.size();//쇠막대기 만큼 추가
                else//그냥 닫는 괄호일때
                    cnt++;//총 개수 +1
            }
        }
        System.out.println(cnt);
    }
}
