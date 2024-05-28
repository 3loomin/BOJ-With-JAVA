package Boj4;

import java.io.*;

public class Boj4_5 {
    public static void boj4_5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = br.readLine();
        String[] s = T.split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] res = new int[n];


        for (int i = 0; i < m; i++) {

            String s1 = br.readLine();
            String[] s2 = s1.split(" ");

            int from = Integer.parseInt(s2[0]);
            int to = Integer.parseInt(s2[1]);
            for (int j = from - 1 ; j < to; j++) {
                res[j] = Integer.valueOf(s2[2]);
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
