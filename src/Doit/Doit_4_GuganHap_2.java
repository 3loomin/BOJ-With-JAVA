package Doit;

import java.io.*;
import java.util.StringTokenizer;

public class Doit_4_GuganHap_2 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        //배열 저장
        int[][] a = new int[n + 1][n + 1];
        for ( int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            for ( int j = 1; j <= n; j++ ){
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 구간 합 배열
        int[][] s = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i][j];
            }
        }
        //testcase
        for(int i = 0; i < c; i++){
            st = new StringTokenizer(br.readLine());
            int start_x = Integer.parseInt(st.nextToken());
            int start_y = Integer.parseInt(st.nextToken());
            int end_x = Integer.parseInt(st.nextToken());
            int end_y = Integer.parseInt(st.nextToken());

            int result = s[end_x][end_y] - s[start_x - 1][end_y] - s[end_x][start_y - 1] + s[start_x - 1][start_y - 1];

            bw.write((result) + "\n" );
        }
        bw.flush();
        bw.close();

    }
}
