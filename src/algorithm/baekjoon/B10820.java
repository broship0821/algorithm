package algorithm.baekjoon;

import java.util.Scanner;

public class B10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //어떻게 반복 횟수를 정할지?
        for (int i = 0; i < 102; i++) {
            String str = sc.nextLine();

            if ("".equals(str)) return;

            int low = 0;
            int up = 0;
            int num = 0;
            int sp = 0;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c>='a' && c<='z') low++;
                else if (c>='A' && c<='Z') up++;
                else if (c>='0' && c<='9') num++;
                else sp++;
            }
            if (low+up+num+sp!=0)
                System.out.println(low + " " + up + " " + num + " " + sp);
        }
    }
}
