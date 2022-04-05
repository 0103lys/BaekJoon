package BaekJoon;

import java.util.Scanner;

public class Problem1330 {
    public String solution(int a, int b){
        String answer = "";
        if(a<b){
            answer = "<";
        }else if(a>b){
            answer = ">";
        }else
            answer = "==";
        return answer;
    }
    public static void main(String[] args) {
        Problem1330 problem1330 = new Problem1330();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(problem1330.solution(a, b));
    }
}
