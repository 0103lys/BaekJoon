package BaekJoon;

import java.util.Scanner;

public class Problem2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int time = sc.nextInt();

        hour += time/60;
        minute += time%60;
        if(minute>=60){
            hour+=1;
            minute-=60;
        }
        if(hour>=24){
            hour -= 24;
        }

        System.out.println(hour + " "+minute);


    }
}
