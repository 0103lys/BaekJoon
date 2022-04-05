package BaekJoon;

import java.util.Scanner;

public class Problem14681 {
    public int solution(int a, int b){
        int answer = 0;
        if(a>0 && b>0){
            answer = 1;
        }else if(a<0 && b>0){
            answer = 2;
        }else if(a<0 && b<0){
            answer = 3;
        }else
            answer = 4;
        return answer;
    }
    public static void main(String[] args) {
        Problem14681 problem14681 = new Problem14681();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(problem14681.solution(a,b));
    }
}
