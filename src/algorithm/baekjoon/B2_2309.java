package algorithm.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int[] arr = new int[n];
        int sum = 0;
        //9명의 키 전부 더하기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        // 정렬 -> 오름차순 출력을 위해
        Arrays.sort(arr);
        //2명의 키 값 빼기, 모든 경우의 수만큼
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (sum - arr[i] - arr[j] == 100){
                    for (int k = 0; k < n; k++) {
                        if (arr[k]!=arr[i] && arr[k]!=arr[j])//난쟁이의 키는 다 다르므로
                            System.out.println(arr[k]);
                    }
                    //정답은 한번만 출력되도록
                    System.exit(0);
                }
            }
        }
    }
}
