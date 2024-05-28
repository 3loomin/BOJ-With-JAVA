package Boj8;

import java.io.*;

public class Boj8_3 {
    public static void boj8_3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Integer a = Integer.parseInt(br.readLine());
            //Q 25 D 10 N 5 P 1
            int[] coin = {25,10,5,1};
            String[] answer = new String[4];
            for (int j = 0; j < 4; j++) {
                answer[j] = String.valueOf(a/coin[j]);
                a %= coin[j];
            }

            for (int j = 0; j < answer.length; j++) {
                bw.write(answer[j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
