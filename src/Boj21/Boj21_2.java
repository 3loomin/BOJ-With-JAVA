package Boj21;

import java.io.*;
import java.util.StringTokenizer;

public class Boj21_2 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());
        bw.write(fibonachi(n) + "");


        bw.flush();
        bw.close();
    }

    public static long fibonachi(long n){
        if( n <= 1 ) return n;
        else return fibonachi(n-1) + fibonachi(n - 2);
    }
}
