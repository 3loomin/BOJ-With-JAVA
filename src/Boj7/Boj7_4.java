package Boj7;

import java.io.*;
import java.util.StringTokenizer;

public class Boj7_4 {
    public static void boj7_4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer T = Integer.valueOf(br.readLine());
        int[][] answer = new int[100][100];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            for(int j = N; j < N + 10 && j < 100; j++) {
                for (int k = M; k < M + 10 && k < 100; k++) {
                    answer[j][k] = 1;
                }
            }
        }

        int count = 0 ;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(answer[i][j] == 1) count++;
            }
        }

        System.out.println(count);


        bw.flush();
        bw.close();
        br.close();
    }
}
