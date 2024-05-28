package Boj5;

import java.io.*;

public class Boj5_4 {
    public static void boj5_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char c = s.charAt(0);

        System.out.println((int)c);

        bw.flush();
        bw.close();
        br.close();
    }
}
