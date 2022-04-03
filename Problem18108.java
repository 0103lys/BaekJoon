package BaekJoon;

import java.util.Scanner;

public class Problem18108 {
    public int solution(int year){
        int answer = 0;
        answer = year - 543;
        return answer;

    }
    public static void main(String[] args) {
        Problem18108 problem18108 = new Problem18108();
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(problem18108.solution(year));
    }
}
