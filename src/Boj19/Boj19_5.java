package Boj19;

import java.io.*;
import java.util.StringTokenizer;

public class Boj19_5 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(c(b,a) + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static long c(int n, int k) {
        long fact = 1;
        long div = 1;
        k = Math.min(k , n-k);
        for (int i = 0; i < k; i++) {
            fact *= n--;
        }
        for (int i = k; i >= 1; i--) {
            div *= i;
        }
        return fact/div;
    }
}
