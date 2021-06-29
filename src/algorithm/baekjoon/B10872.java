package algorithm.baekjoon;

import java.util.Scanner;
//재귀 - 팩토리얼
public class B10872 {

    public static int fac(int result){
        if (result<=1) return 1; //종료시점 명시
        return result * fac(result-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fac(n);
        System.out.println(result);
    }
}
