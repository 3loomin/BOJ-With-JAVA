package Boj3;

import java.io.*;

public class Boj3_11 {
    public static void boj3_11() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //Integer num = Integer.valueOf(br.readLine());
        String str = br.readLine();
        String[] s = str.split(" ");
        while(!(s[0].equals("0") && s[1].equals("0"))) {
            bw.write((Integer.valueOf(s[0]) + Integer.valueOf(s[1]))+"\n");
            String a = br.readLine();
            s = a.split(" ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
