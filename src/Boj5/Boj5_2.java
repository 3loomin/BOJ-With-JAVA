package Boj5;

import java.io.*;

public class Boj5_2 {
    public static void boj5_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        System.out.println(str.length());


        bw.flush();
        bw.close();
        br.close();
    }
}
