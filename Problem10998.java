package BaekJoon;

import java.util.Scanner;

public class Problem10998 {
    public int solution(int a, int b){
        int answer = 0;
        answer = a * b;
        return answer;
    }
    public static void main(String[] args) {
        Problem10998 problem10998 = new Problem10998();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(problem10998.solution(a, b));
    }
}
