package algorithm.baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();

        StringBuilder result = new StringBuilder();
        int num = 0;
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            switch (command){
                case "push":
                    num = sc.nextInt();
                    q.offer(num);
                    break;
                case "pop":
                    result.append(q.isEmpty()?"-1\n":q.poll()+"\n");
                    break;
                case "size":
                    result.append(q.size()+"\n");
                    break;
                case "empty":
                    result.append(q.isEmpty()?"1\n":"0\n");
                    break;
                case "front":
                    result.append(q.isEmpty()?"-1\n":q.peek()+"\n");
                    break;
                case "back":
                    result.append(q.isEmpty()?"-1\n":num+"\n");
                    break;
            }
        }
        System.out.println(result);
    }
}
