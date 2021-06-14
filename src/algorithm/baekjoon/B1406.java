package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
//시간초과
public class B1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int n = Integer.parseInt(reader.readLine());

        Stack<String> left = new Stack<>();
        Stack<String> right = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            left.push(str.substring(i,i+1));
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            String command = st.nextToken();
            switch (command){
                case "L":
                    if (!left.empty()) right.push(left.pop());
                    break;
                case "D":
                    if (!right.empty()) left.push(right.pop());
                    break;
                case "B":
                    if (!left.empty()) left.pop();
                    break;
                case "P":
                    String c = st.nextToken();
                    left.push(c);
                    break;
            }
        }

        int size = right.size();
        for (int i = 0; i < size; i++) {
            left.push(right.pop());
        }
        for (String c : left) {
            System.out.print(c);
        }
    }
}
