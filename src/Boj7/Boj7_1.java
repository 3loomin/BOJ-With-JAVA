package Boj7;

import java.io.*;
import java.util.StringTokenizer;

public class Boj7_1 {
    public static void boj7_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] answer = new int[n][m];
        // 값을 저장
        for (int i = 0; i < 2; i++) {
            int[][] tmp = new int[n][m];

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    tmp[j][k] = Integer.valueOf(st.nextToken());
                    answer[j][k] += tmp[j][k];
                }
            }
        }
        //출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(answer[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
