package algorithm.baekjoon;

import java.util.Scanner;

public class S1_11047 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int money = sc.nextInt();
//        int[] coins = new int[size];
//        for (int i = 0; i < size; i++) {
//            coins[i] = sc.nextInt();
//        }
//
//        int cnt = 0;
//        for (int i = size-1; i >= 0; i--) {
//            if(coins[i]<=money){
//                while (money-coins[i]>=0){
//                    money -= coins[i];
//                    cnt++;
//                }
//            }
//        }
//
//        System.out.println(cnt);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int money = sc.nextInt();
        int[] coins = new int[size];
        for (int i = 0; i < size; i++) {
            coins[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = size-1; i >= 0; i--) {
            if(coins[i]<=money){
                cnt += (money/coins[i]);
                money %= coins[i];
            }
        }

        System.out.println(cnt);
    }
}
