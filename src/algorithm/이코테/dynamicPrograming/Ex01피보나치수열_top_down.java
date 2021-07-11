package algorithm.이코테.dynamicPrograming;

import java.util.Scanner;

public class Ex01피보나치수열_top_down {
    //100까지 담을 수 있는 배열
    static long[] arr = new long[101];

    public static long fibo(int x){
        //종료 조건 명시
        if (x==1 || x==2)
            return 1;
        //계산 했던건 그대로 출력
        if (arr[x]!=0)
            return arr[x];
        //처음 계산하는건 계산 후 배열에 담앋두기
        arr[x] = fibo(x-1) + fibo(x-2);
        return arr[x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fibo(x));
    }
}
