package Boj5;

import java.io.*;
public class Boj5_1 {
    public static void boj5_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        Integer i = Integer.valueOf(br.readLine());

        String substring = str.substring(i - 1, i);
        System.out.println(substring);


        bw.flush();
        bw.close();
        br.close();
    }

}
