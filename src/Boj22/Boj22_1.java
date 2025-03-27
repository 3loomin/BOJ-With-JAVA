package Boj22;

import java.io.*;
import java.util.StringTokenizer;

public class Boj22_1 {
    public static int[] arr;
    public static boolean[] visit;
    public static void solution() throws IOException {
        /*
        Boj_15649_s3 백트래킹 N과 M

        입력 받는 숫자  N 과 M 이  (1 ≤ M ≤ N ≤ 8) 라는 조건으로 주어진다

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visit = new boolean[N];

        dfs(N,M,0);

    }

    public static void dfs(int N, int M, int depth) {
        if(depth == M) {
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N,M,depth+1);
                visit[i] = false;
            }
        }
    }
}
