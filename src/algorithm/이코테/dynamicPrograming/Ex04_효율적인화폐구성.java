package algorithm.이코테.dynamicPrograming;

import java.util.Scanner;

public class Ex04_효율적인화폐구성 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //각 화폐 단위 담는 배열
        int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = sc.nextInt();
        }
        //0원은 0으로, 나머지 아직 못구한 값은 10001로 초기화
        int[] dp = new int[m+1];
        for (int i = 1; i <= m; i++) {
            dp[i] = 10001;
        }
        //2중 반복문을 돌며 각 화폐로 구할수 있는 최소 개수를 구한다
        for (int mon : money){
            for (int i = mon; i <= m; i++) {
                if (dp[i-mon] != 10001){
                    dp[i] = Math.min(dp[i], dp[i-mon]+1);
                }
            }
        }
        if (dp[m] == 10001)
            System.out.println(-1);
        else
            System.out.println(dp[m]);

    }
}
