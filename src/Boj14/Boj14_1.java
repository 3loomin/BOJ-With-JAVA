package Boj14;

import java.io.*;
import java.util.StringTokenizer;

public class Boj14_1 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[20000001];
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[10000000 + Integer.parseInt(st.nextToken())] = 1 ;
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if (arr[10000000 + Integer.valueOf(st.nextToken())] == 1) bw.write(1 + " ");
            else bw.write(0 + " ");

        }

        bw.flush();
    }
}
