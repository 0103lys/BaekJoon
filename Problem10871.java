package BaekJoon;

import java.util.Scanner;

public class Problem10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[a];
        for(int i=0; i<a; i++){
            nums[i] = sc.nextInt();
            if(nums[i]<x){
                System.out.print(nums[i]+" ");
            }
        }



    }
}
