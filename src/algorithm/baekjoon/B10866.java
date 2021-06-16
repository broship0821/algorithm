package algorithm.baekjoon;

import java.util.LinkedList;
import java.util.Scanner;
//시간초과
public class B10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            switch (command){
                case "push_front":
                    list.add(0, sc.nextInt());
                    break;
                case  "push_back":
                    list.add(sc.nextInt());
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
