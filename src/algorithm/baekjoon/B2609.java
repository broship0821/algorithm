package algorithm.baekjoon;

import java.util.Scanner;
//최대공약수와 최소공배수
public class B2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //최대공약수
        int c = 0;
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a%i==0 && b%i==0)
                c = i;
        }
        System.out.println(c);

        //최소공배수
        
    }
}
