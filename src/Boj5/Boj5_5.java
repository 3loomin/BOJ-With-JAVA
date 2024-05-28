package Boj5;

import java.io.*;

public class Boj5_5 {
    public static void boj5_5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        String str = br.readLine();
        String[] split = str.split("");
        int sum = 0;
        for (int i = 0; i < Integer.valueOf(n); i++) {
            sum += Integer.parseInt(split[i]);
        }

        System.out.println(sum);

        bw.flush();
        bw.close();
        br.close();
    }
}
