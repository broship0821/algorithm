package algorithm.baekjoon;

import java.util.Scanner;

public class B11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int b = sc.nextInt();
        //35 이게 한자리니 sb로는 안됨 스텍이나 리스트 같은거 사용해야됨
        StringBuilder sb = new StringBuilder();
        while (n!=0){
            sb.append(n%b);
            n /= b;
        }

        for (int i = sb.length()-1; i >= 0; i--) {
            int num = sb.charAt(i) - '0';
            if (num < 10)
                System.out.println(num);
            else
                System.out.println((char)(num+55));
        }
    }
}
