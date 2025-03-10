package Doit;

import java.io.*;
import java.util.StringTokenizer;

public class Doit_3_GuganHap {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] a = new int[n + 1];
        int[] s = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(st.nextToken());
            if( i == 0) s[i] = a[i];
            else s[i] = s[i - 1] + a[i];
        }

        //testcase
        for(int i = 0; i < c; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            bw.write((s[end] - s[start - 1]) +"\n");
        }

        bw.flush();
        bw.close();
    }
}
