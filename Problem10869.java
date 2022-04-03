package BaekJoon;

import java.util.Scanner;

public class Problem10869 {
    public int add(int a, int b){
        int answer = 0;
        answer = a+b;

        return answer;

    }
    public int minus(int a, int b){
        int answer = 0;
        answer = a-b;

        return answer;

    }
    public int multiply(int a, int b){
        int answer = 0;
        answer = a*b;

        return answer;

    }
    public int divide(int a, int b){
        int answer = 0;
        answer = a/b;
        return answer;

    }
    public int mod(int a, int b){
        int answer = 0;
        answer = a%b;

        return answer;

    }
    public static void main(String[] args) {
        Problem10869 problem10869 = new Problem10869();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(problem10869.add(a, b));
        System.out.println(problem10869.minus(a, b));
        System.out.println(problem10869.multiply(a, b));
        System.out.println(problem10869.divide(a, b));
        System.out.println(problem10869.mod(a, b));
    }
}
