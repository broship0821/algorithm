package algorithm.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B2_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= n; i++) {
            list.add(list.get(i-2)+list.get(i-1));
        }
        System.out.println(list.get(n));
    }
}
