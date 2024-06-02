package Boj21;

import java.io.*;
import java.util.StringTokenizer;

public class Boj21_1 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        bw.write(facto(n) + "");


        bw.flush();
        bw.close();
    }

    public static long facto(long n){
        if(n > 1){
            return n * facto(--n);
        }
        else return 1;
    }
}
