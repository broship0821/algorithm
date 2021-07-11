package algorithm.baekjoon;

import java.util.Scanner;
//다이나믹 프로그래밍 공부하고 풀기
public class B1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int cnt = 0;
        while (x!=1){
            if (x%3==0) x /= 3;
            else if (x%2==0) x/= 2;
            else x--;
            cnt++;
        }
        System.out.println(cnt);
    }
}
