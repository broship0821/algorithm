package algorithm.baekjoon;

import java.util.Scanner;

public class B10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = 0;//놓여진 쇠막대기 개수
        int cnt = 0;//총 쇠막대기 개수

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='('){//여는 괄호일때
                if (input.charAt(i+1)!=')'){//레이저가 아닐때
                    n++;//놓여진 쇠막대기 +1
                    cnt++;//총 쇠막대기 +1
                } else {//바로 닫는 괄호를 만나면 레이저
                    cnt += n;//놓여진 쇠막대기 만큼 +
                    i++;//다음 괄호 스킵
                }
            } else {//닫는 괄호 일때
                n--;//놓여진 쇠막대기 하나가 치워지는걸 의미
            }
        }
        System.out.println(cnt);
    }
}
