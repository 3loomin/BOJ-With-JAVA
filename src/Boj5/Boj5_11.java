package Boj5;

import java.io.*;

public class Boj5_11 {
    public static void boj5_11() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        while( s != null){
            System.out.println(s);
            s = br.readLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
