package Boj15;

import java.io.*;
import java.util.StringTokenizer;

public class Boj15_6 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        br.close();

        for (int i = m; i <= n; i++) {
            if (isPrime(i) && i != 1) bw.write(i +"\n");
        }
        bw.flush();
        bw.close();

    }

    public static boolean isPrime(long a){
        int mit = 2;
        while (a > 1 && mit <= Math.sqrt(a)) {
            if (a % mit == 0 ) {
                return false;
            } else mit++;
        }
        return true;
    }
}
