package Doit;

import java.io.*;
import java.util.StringTokenizer;

public class Doit_4_GuganHap_2 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 2차원 가로세로 크기 N x N
        int N = Integer.parseInt(st.nextToken());
        // 문제 수
        int Q = Integer.parseInt(st.nextToken());
        // 배열들 초기화 해주기
        int[][] A = new int[N + 1][N + 1];
        int[][] S = new int[N + 1][N + 1];

        // 배열 구성하기
        for(int i = 1 ; i <= N ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1 ; j <= N ; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                // S현재 값은 왼쪽(i-1)과 위(j-1)를 더하면 대각선(i-1,j-1)에 있는게 두 번 더해지니 대각선 값을 한번은 빼주고 현재 입력 값(A[i][j]) 더해주기!
                S[i][j] = S[i - 1][j] + S[i][j -1] - S[i - 1][j - 1] + A[i][j];
            }
        }

        // 답 찾기
        for(int i = 1 ; i <= Q ; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 1차원과 마찬가지다 한칸 옆에씩을 빼줘야 하는데 그러면 또 겹치는 부분이 생기니 그 부분만큼 더 해주면 된다!
            int res = S[x2][y2] - S[x2][y1-1] - S[x1-1][y2] + S[x1-1][y1-1];
            bw.write(res + "\n");
        }
        bw.flush();
        bw.close();
    }

}
