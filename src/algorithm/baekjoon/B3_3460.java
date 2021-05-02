package algorithm.baekjoon;

import java.util.Scanner;

public class B3_3460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //2진수 담을 String 배열
        String[] binary = new String[n];
        //2진수 구하기
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            String tmp = "";
            while (num!=1){
                tmp += num%2;
                num /= 2;
            }
            tmp += num;
            binary[i] = tmp;
        }
        //1의 위치 찾아 출력하기
        for (String tmp : binary){
            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i)=='1'){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
