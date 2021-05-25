package algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;
// 실패
public class S3_14713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String[] writing = sc.nextLine().split(" ");

        int idx = 0;
        for (int i = 0; i < n; i++) {
            String[] tmp = arr[i].split(" ");
            int check = 0;

            for (String word : tmp) {
                for (; idx < writing.length; idx++) {
                    if (idx>=writing.length){
                        System.out.println("Impossible");
                        return;
                    }
                    if (word.equals(tmp[idx])){
                        System.out.println(word + tmp[idx]);
                        System.out.println("일치!");
                        break;
                    }
                }
            }
        }
    }
}
