package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = br.readLine()) != null) {
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
