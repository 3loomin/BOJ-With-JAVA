package Boj5;

import java.io.*;

public class Boj5_3 {
    public static void boj5_3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer T = Integer.valueOf(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            bw.write( s.substring(0,1) + s.substring(s.length()-1,s.length())+"\n");
        }



        bw.flush();
        bw.close();
        br.close();
    }
}
