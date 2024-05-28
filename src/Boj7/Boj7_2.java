package Boj7;

import java.io.*;
import java.util.StringTokenizer;

public class Boj7_2 {
    public static void boj7_2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] a = new int[9][9];
        //저장
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                a[i][j]= Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int xIdx =0;
        int yIdx =0;
        //최댓값과 인덱스 구하기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(max < a[i][j]) {
                    max = a[i][j];
                    xIdx = i;
                    yIdx = j;
                }
            }
        }
        bw.write(max + "\n" + (xIdx + 1) + " " + (yIdx + 1));

        bw.flush();
        bw.close();
        br.close();
    }
}
