package Boj3;

import java.io.*;

public class Boj3_12 {

    public static void boj3_12() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //Integer num = Integer.valueOf(br.readLine());
        String a = br.readLine();
        while(a != null) {
            String[] s = a.split(" ");
            bw.write((Integer.valueOf(s[0]) + Integer.valueOf(s[1]))+"\n");
            a = br.readLine();
        }
        bw.flush();
        bw.close();
        br.close();
        // 실제 동작안댐
    }
}
