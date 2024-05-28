package Boj4;

import java.io.*;

public class Boj4_6 {
    public static void boj4_6() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = br.readLine();
        String[] s = T.split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = i + 1;

        }
        for (int i = 0; i < m; i++) {
            String s1 = br.readLine();
            String[] s2 = s1.split(" ");
            int from = Integer.parseInt(s2[0]) - 1 ;
            int to = Integer.parseInt(s2[1]) - 1;
            int tmp = res[from];
            res[from] = res[to];
            res[to] = tmp;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
