package algorithm.baekjoon;

import java.util.Scanner;

public class B1_20113 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //투표 받은 횟수 만들기
        int[] vote = new int[num];
        for (int i=0;i<num;i++){
            int tmp = sc.nextInt();
            if(tmp!=0)
                vote[tmp-1]++;
        }

        //최대값 구하기
        int max = 0;
        for (int i=0;i<num;i++){
            if(vote[i]>max)
                max = vote[i];
        }

        //최대값 중복 체크
        int cnt = 0;
        int idx = 0;
        for (int i=0;i<num;i++){
            if(vote[i]==max){
                cnt++;
                idx = i;
            }
        }
        //최대값이 하나라면 해당 사람 퇴출
        if(cnt==1)
            System.out.println(idx+1);
        else//최대값이 여럿일 경우 스킵
            System.out.println("skipped");
    }
}
