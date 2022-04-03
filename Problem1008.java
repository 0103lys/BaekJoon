package BaekJoon;

import java.util.Scanner;

public class Problem1008 {
    public double solution(double a, double b){
        double answer = 0;
        answer = a / b;
        return answer;
    }
    public static void main(String[] args) {
        Problem1008 problem1008 = new Problem1008();
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println(problem1008.solution(a, b));
    }
}
