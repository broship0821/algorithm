package algorithm.baekjoon.복습;

import java.util.Scanner;

//최대공약수와 최소공배수
public class B2609 {

    //최대공약수 재귀 방식
    public static int gcd(int a, int b){
        if (b==0) return a;
        //gcd(a,b) = gcd(b,r) 이므로 r을 a%b로 바꿔줌
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //최대공약수
        int c = gcd(a, b);

        System.out.println(c);
        System.out.println(a * b / c);//최소공배수
    }
}
