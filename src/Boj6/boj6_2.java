package Boj6;

import java.io.*;

public class boj6_2 {
    public static void boj6_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String[] split = s.split(" ");
        int[] oneSet = {1,1,2,2,2,8};
        int[] answer = new int[oneSet.length];

        for (int i = 0; i < oneSet.length; i++) {
            answer[i] = Integer.valueOf(split[i]) - oneSet[i];
            bw.write((-1* answer[i]) +" ");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
