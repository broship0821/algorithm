package algorithm.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B17413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine(); // 문자열 s 입력받기
        Stack<Character> stack = new Stack<>(); // 단어 담을 스텍
        boolean flag = false; // 태그 안에 있는 문자면 true

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c=='<'){ //여는 괄호일 경우 이전 문자를 거꾸로 출력 한다
                flag = true; //flag는 true로(단어를 순서 그대로 출력한다)
                while (!stack.isEmpty()){//출력
                    System.out.print(stack.pop());
                }
                System.out.print(c);
            } else if (c=='>'){//닫는 괄호일 경우
                flag = false;//flag는 false로
                System.out.print(c);
            } else {
                if (flag)//태그 안에 있을 경우 순서대로 출력
                    System.out.print(c);
                else{//태그 밖에 있을 경우
                    if (c!=' ')//공백이면 이전 문자 거꾸로 출력
                        stack.push(c);
                    else{//스텍에 담아 거꾸로 만든다
                        while (!stack.isEmpty()){//출력
                            System.out.print(stack.pop());
                        }
                        System.out.print(c);
                    }
                }
            }
        }
        //마지막에 스텍의 모든 단어를 출력한다
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
