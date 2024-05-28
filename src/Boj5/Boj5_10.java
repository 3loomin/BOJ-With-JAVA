package Boj5;

import java.io.*;

public class Boj5_10 {
    public static void boj5_10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] split = s.split("");

        int[] alphabet = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        int sum = 0;

        for (int i = 0; i < split.length; i++) {
            int n = split[i].charAt(0) - 'A' ;
            sum += alphabet[n];
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
        br.close();
    }
}
