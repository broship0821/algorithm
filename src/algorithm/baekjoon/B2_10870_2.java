package algorithm.baekjoon;

import java.util.Scanner;

public class B2_10870_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int n){
        if (n==0) return 0;
        else if (n==1) return 1;
        return fibonacci(n-2) + fibonacci(n-1);
    }
}
