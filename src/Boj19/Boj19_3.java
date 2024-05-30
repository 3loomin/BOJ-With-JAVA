package Boj19;

import java.io.*;
import java.util.StringTokenizer;

public class Boj19_3 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        bw.write(fact + "");

        bw.flush();
        bw.close();
    }
}
