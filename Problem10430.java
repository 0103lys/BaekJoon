package BaekJoon;

import java.util.Scanner;

public class Problem10430 {
    public int result1(int a, int b, int c){
        int answer = 0;
        answer = (a+b)%c;
        return answer;
    }
    public int result2(int a, int b, int c){
        int answer = 0;
        answer = ((a%c) + (b%c))%c;
        return answer;
    }
    public int result3(int a, int b, int c){
        int answer = 0;
        answer = (a*b)%c;
        return answer;
    }
    public int result4(int a, int b, int c){
        int answer = 0;
        answer = ((a%c) * (b%c))%c;
        return answer;
    }
    public static void main(String[] args) {
        Problem10430 problem10430 = new Problem10430();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(problem10430.result1(a, b, c));
        System.out.println(problem10430.result2(a, b, c));
        System.out.println(problem10430.result3(a, b, c));
        System.out.println(problem10430.result4(a, b, c));
    }
}
