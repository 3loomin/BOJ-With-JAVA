package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_2775 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());
        int[][] answer = new int[15][14];

        for (int i = 0; i < 14; i++) {
            answer[0][i] = i + 1;
        }
        for (int i = 1; i < 15; i++) {
            answer[i][0] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 14; j++) {
                answer[i][j] = answer[i][j-1] + answer[i-1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());
            bw.write(answer[k][m - 1] + "\n");
        }


        bw.flush();
        bw.close();
    }
}
