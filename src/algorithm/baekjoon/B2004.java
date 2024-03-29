package algorithm.baekjoon;

import java.util.Scanner;

public class B2004 {
    //num에서 5를 몇개까지 나눌 수 있는지 구하기
    public static int getFivePower(int num){
        int cnt = 0;
        while (num >= 5){
            cnt += num/5;
            num /= 5;
        }
        return cnt;
    }
    //num에서 2를 몇개까지 나눌 수 있는지 구하기
    public static int getTwoPower(int num){
        int cnt = 0;
        while (num >= 2){
            cnt += num/2;
            num /= 2;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //공식, n과m의 조합 = 2^(n - (n-m) - m) * 5^(n - (n-m) - m)
        int five = getFivePower(n) - getFivePower(n-m) - getFivePower(m);
        int two = getTwoPower(n) - getTwoPower(n-m) - getTwoPower(m);
        //2와 5가 매칭되는 수만큼 0이 생김
        System.out.println(Math.min(five, two));
    }
}
