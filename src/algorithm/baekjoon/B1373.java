package algorithm.baekjoon;

import java.util.Scanner;

public class B1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 3자리씩 끊을 수 있도록 자리수 맞추기
        int size = str.length();
        if (size%3==2) str = "0" + str;
        if (size%3==1) str = "00" + str;
        //변환할 8진수를 담을 sb
        StringBuilder sb = new StringBuilder();
        //각 자리수 연산 결과를 임시로 담을 변수
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            int num = str.charAt(i) - '0';
            //반복문을 돌면서 각 자리수 계산
            if (i%3==2) a = num*1;
            else if (i%3==1) b = num*2;
            else if (i%3==0){
                c = num*4;
                sb.append(a+b+c);
            }
        }
        System.out.println(sb.reverse());
    }
}
