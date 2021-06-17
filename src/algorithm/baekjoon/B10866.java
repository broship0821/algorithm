package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class B10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]){
                case "push_front":
                    list.add(0, Integer.parseInt(command[1]));
                    break;
                case  "push_back":
                    list.add(Integer.parseInt(command[1]));
                    break;
                case "pop_front":
                    if (!list.isEmpty())
                        System.out.println(list.poll());
                    else
                        System.out.println(-1);
                    break;
                case "pop_back":
                    if (!list.isEmpty()){
                        System.out.println(list.getLast());
                        list.remove(list.size()-1);
                    }
                    else
                        System.out.println(-1);
                    break;
                case "size":
                    System.out.println(list.size());
                    break;
                case "empty":
                    System.out.println(list.isEmpty()?1:0);
                    break;
                case "front":
                    System.out.println(list.isEmpty()?-1:list.peek());
                    break;
                case "back":
                    System.out.println(list.isEmpty()?-1:list.getLast());
                    break;
            }
        }
    }
}
