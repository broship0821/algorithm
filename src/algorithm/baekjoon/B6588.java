package algorithm.baekjoon;

import java.util.Scanner;

public class B6588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //소수 구하기
        boolean[] sosu = new boolean[1000001];
        sosu[0] = true;
        sosu[1] = true;
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            if (sosu[i]) continue;
            for (int j = i*i; j <= 1000000; j+=i) {
                sosu[j] = true;
            }
        }
        //홀수만 false로
        for (int i = 2; i <= 1000000; i+=2) {
            sosu[i] = true;
        }

        int num = 0;
        while ((num=sc.nextInt())!=0){
            for (int i = 3; i <= 1000000; i++) {
                if (!sosu[i] && !sosu[num-i]){
                    System.out.println(num + " = " + i + " + " + (num-i));
                    break;
                }
            }
        }
    }
}
