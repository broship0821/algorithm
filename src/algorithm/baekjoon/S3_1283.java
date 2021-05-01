package algorithm.baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class S3_1283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] options = new String[n];
        for (int i = 0; i < n; i++) {
            options[i] = sc.nextLine();
        }
        //단축키 저장하는 set
        Set<Character> keys = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] tmp = options[i].split(" ");
            int j = 0;
            int size = tmp.length;
            //각 단어 첫번째 글자 단축키 지정되있는지 체크, 없을경우 추가
            for (; j < size; j++) {
                Character key = Character.toUpperCase(tmp[j].charAt(0));
                if(!keys.contains(key)){
                    keys.add(key);
                    break;
                }
            }
            if(j==size){//각 단어 첫번째 글자가 전부 사용중일때 모든 글자 하나씩 체크
                for (int m = 0; m < size; m++) {
                    boolean flag = false;
                    for (int k = 0; k < tmp[m].length(); k++) {
                        Character key = Character.toUpperCase(tmp[m].charAt(k));
                        if(!keys.contains(key)){
                            keys.add(key);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) break;
                }
            }
        }
        //저장된 단축키 출력
        System.out.println(keys);
    }
}
