package algorithm.baekjoon;

import java.util.Scanner;
// -2진수
public class B2089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        if (n==0)
            System.out.println(0);
        else {
            while (n!=1){
                //기존 2진수 구하는 방법
//                sb.append(n%2);
//                n /= 2;
                //-2진수 구하는 방법
                sb.append(Math.abs(n%-2));
                n = (int)Math.ceil((double)n/(-2));
            }
            sb.append(n);
        }
        System.out.println(sb.reverse());
    }
}
