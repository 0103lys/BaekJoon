package BaekJoon;

import java.util.Scanner;

public class Problem2480 {
    public int solution(int num1, int num2, int num3){
        int answer = 0;
        int tmp = 0;
        if(num1==num2 && num2==num3){
            answer = 10000+(num1*1000);
        }else if(num1==num2 && num1!=num3){
            answer = 1000+(num1*100);
        }else if(num2==num3 && num2!=num1){
            answer = 1000+(num2*100);
        }else if(num1==num3&& num1!=num2){
            answer = 1000+(num1*100);
        }else{
           if(num1>num2){
               tmp = num1;
               if(tmp>num3){
                   answer = tmp*100;
               }else{
                   answer = num3*100;
               }
           }else {
               tmp = num2;
               if(tmp>num3){
                   answer = tmp*100;
               }else {
                   answer = num3*100;
               }
           }
        }
        return answer;
    }
    public static void main(String[] args) {
        Problem2480 problem2480 = new Problem2480();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(problem2480.solution(num1, num2, num3));

    }
}
