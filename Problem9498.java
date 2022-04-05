package BaekJoon;

import java.util.Scanner;

public class Problem9498 {
    public char solution(int score){
        char answer = ' ';
        if(score>=90){
            answer = 'A';
        }else if(score>=80) {
            answer = 'B';
        }else if(score>=70){
            answer = 'C';
        }else if(score>=60){
            answer = 'D';
        }else
            answer = 'F';
        return answer;

    }
    public static void main(String[] args) {
        Problem9498 problem9498 = new Problem9498();
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        System.out.println(problem9498.solution(score));
    }
}
