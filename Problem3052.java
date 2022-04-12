package BaekJoon;

import java.util.HashMap;
import java.util.Scanner;

public class Problem3052 {
    public int solution(int[] arr){
        int answer = 0;
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hashMap.containsKey(arr[i]%42)){
                hashMap.put(arr[i]%42, false);
            }else
                hashMap.put(arr[i]%42, true);
        }
        answer = hashMap.size();
        return answer;
    }
    public static void main(String[] args) {
        Problem3052 problem3052 = new Problem3052();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(problem3052.solution(arr));
    }
}
