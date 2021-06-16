package algorithm.baekjoon;

import java.io.*;
import java.util.Stack;
public class B1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = reader.readLine();
        int n = Integer.parseInt(reader.readLine());

        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        String[] arr = str.split("");
        for (String s : arr) {
            left.push(s);
        }

        for (int i = 0; i < n; i++) {
            String command = reader.readLine();
            char c1 = command.charAt(0);
            switch (c1){
                case 'L':
                    if (!left.empty()) right.push(left.pop());
                    break;
                case 'D':
                    if (!right.empty()) left.push(right.pop());
                    break;
                case 'B':
                    if (!left.empty()) left.pop();
                    break;
                case 'P':
                    char c2 = command.charAt(2);
                    left.push(String.valueOf(c2));
                    break;
            }
        }

        int size = right.size();
        for (int i = 0; i < size; i++) {
            left.push(right.pop());
        }
        for (String c : left) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}
