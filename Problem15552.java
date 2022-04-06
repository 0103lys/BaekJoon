package BaekJoon;

import java.io.*;

public class Problem15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bufferedReader.readLine());
        for(int i=0; i<num; i++){
            String s = bufferedReader.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bufferedWriter.write(a+b+"\n");
        }
        bufferedWriter.flush();
    }

}
