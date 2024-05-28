package Boj3;

import java.io.*;

public class Boj3_10 {
    public static void boj3_10() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.valueOf(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < num - i; j++) {
                bw.write(" ");
            }
            for(int k = 0; k < i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
