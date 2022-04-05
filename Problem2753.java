package BaekJoon;

import java.util.Scanner;

public class Problem2753 {
    public int solution(int year){
        int answer = 0;
        if(year%4==0 && (year%400==0 || year%100!=0)){
           answer = 1;
        }
        return answer;

    }
    public static void main(String[] args) {
        Problem2753 problem2753 = new Problem2753();
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(problem2753.solution(year));
    }
}
