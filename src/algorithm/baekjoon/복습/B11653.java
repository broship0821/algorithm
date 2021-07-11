package algorithm.baekjoon.복습;

import java.util.Scanner;

//소인수분해
public class B11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int idx = 2;
//        while (n!=1){
//            if (n%idx==0){
//                System.out.println(idx);
//                n /= idx;
//                continue;
//            }
//            idx++;
//        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n%i == 0){
                System.out.println(i);
                n /= i;
            }
        }

        if (n != 1)
            System.out.println(n);
    }
}
