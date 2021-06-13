package algorithm.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); //출력할 결과물 저장 용도
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();
        int start = 1;//시작은 1부터

        for (int i = 0; i < n; i++) { //n번 반복
            int value = sc.nextInt();

            if (value>=start){
                //입력받은 값이 스텍에 집어넣었던 값보다 클 경우
                //start~value까지의 값을 스텍에 push
                for (int j = start; j <= value; j++) {
                    stack.push(j);
                    sb.append("+\n");//push할떄마다 + 저장
                }
                start = value+1;//오름차순 순서대로 push하기 위해 값 저장
            }
            //stack의 top이 입력값과 같지 않으면 수열 만들 수 없음
            else if(stack.peek()!=value){
                System.out.println("NO");
                return;
            }
            //top을 빼서 수열 만들기
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}
