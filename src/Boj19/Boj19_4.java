package Boj19;

import java.io.*;
import java.util.StringTokenizer;

public class Boj19_4 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int nfac = factorial(n);
        int kfac = factorial(k);
        int xfac = factorial(n-k);
        kfac = kfac * xfac;
        nfac = nfac / kfac;

        bw.write(nfac + "");
        bw.flush();
        bw.close();
    }
    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
