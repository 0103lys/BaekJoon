package BaekJoon;

import java.util.Scanner;

public class Problem2588 {
    public int multi1(int a, int b){
        int answer = 0;
        String[] s = String.valueOf(b).split("");
        answer = a * Integer.parseInt(s[2]);
        return answer;
    }
    public int multi2(int a, int b){
        int answer = 0;
        String[] s = String.valueOf(b).split("");
        answer = a * Integer.parseInt(s[1]);
        return answer;
    }
    public int multi3(int a, int b){
        int answer = 0;
        String[] s = String.valueOf(b).split("");
        answer = a * Integer.parseInt(s[0]);
        return answer;
    }


    public static void main(String[] args) {
        Problem2588 problem2588 = new Problem2588();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(problem2588.multi1(a, b));
        System.out.println(problem2588.multi2(a, b));
        System.out.println(problem2588.multi3(a, b));
        System.out.println(a*b);

    }
}
