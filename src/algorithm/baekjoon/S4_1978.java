package algorithm.baekjoon;

import java.util.Scanner;
//틀림 어디서 틀렸을까?
public class S4_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int j = 2;
            for (; j < nums[i]; j++) {
                if (nums[i] % j == 0)
                    break;
            }
            if (j == nums[i]){
                cnt++;
                System.out.println(nums[i]);
            }
        }
        System.out.println(cnt);
    }
}
