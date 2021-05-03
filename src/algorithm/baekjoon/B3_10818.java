package algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B3_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = 1000000;
        int max = -1000000;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp<min) min = tmp;
            if (tmp>max) max = tmp;
        }
        System.out.println(min +" "+ max);
    }
    //정렬해서 푸는 방법
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//        Arrays.sort(nums);
//        System.out.println(nums[0]+" "+nums[n-1]);
//    }
}
