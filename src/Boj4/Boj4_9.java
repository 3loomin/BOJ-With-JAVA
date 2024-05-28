package Boj4;

import java.io.*;

public class Boj4_9 {
    public static void boj4_9() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = i + 1;
        }

        int[] clone = res.clone();

        for (int i = 0; i < m; i++) {
            String s2 = br.readLine();
            String[] s3 = s2.split(" ");
            int from  = Integer.parseInt(s3[0]);
            int to = Integer.parseInt(s3[1]);
            clone = res.clone();
            for (int j = from - 1, k = to - 1  ; j <= to - 1 ; j++, k--) {
                res[j] = clone[k];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
