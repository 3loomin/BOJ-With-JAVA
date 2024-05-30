package Boj19;

import java.io.*;
import java.util.StringTokenizer;

public class Boj19_1 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        bw.write((n * (n - 1)) + "");

        bw.flush();
        bw.close();
    }
}
