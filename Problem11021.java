package BaekJoon;

import java.util.Scanner;

public class Problem11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] result = new int[num];
        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            result[i]=a+b;
        }
        for(int i=0; i<result.length; i++){
            System.out.println("Case #"+(i+1)+": "+result[i]);
        }

    }
}
