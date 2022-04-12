package BaekJoon;

import java.util.Scanner;

public class Problem1000 {
    public int solution(int a, int b){
        int answer = 0;
        answer = a + b;
        return answer;
    }
    public static void main(String[] args) {
        Problem1000 problem1000 = new Problem1000();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(problem1000.solution(a, b));
    }
}
