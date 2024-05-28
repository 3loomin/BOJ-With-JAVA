package Boj5;

import java.io.*;

public class Boj5_7 {
    public static void boj5_7() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = br.readLine();
        for (int i = 0; i < Integer.valueOf(T); i++) {

            String str = br.readLine();
            String[] split = str.split(" ");

            Integer n = Integer.valueOf(split[0]);
            String[] target = split[1].split("");

            for (int j = 0; j < target.length; j++) {
                for (int k = 0; k < n; k++) {
                    bw.write(target[j]);
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
