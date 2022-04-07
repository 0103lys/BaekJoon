package BaekJoon;

import java.util.Scanner;

public class Problem2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = "*";
        for(int i=1; i<=num; i++){
            System.out.println(s);
            s += "*";
        }
    }
}
