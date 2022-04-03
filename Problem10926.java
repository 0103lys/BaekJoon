package BaekJoon;

import java.util.Scanner;

public class Problem10926 {
    public String solution(String str){
        String answer = "";
        answer = str + "??!";
        return answer;

    }
    public static void main(String[] args) {
        Problem10926 problem10926 = new Problem10926();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(problem10926.solution(str));
    }
}
