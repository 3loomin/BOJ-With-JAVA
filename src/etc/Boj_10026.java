package etc;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_10026 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String[][] board = new String[n][n];
        String[][] redgreen = new String[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] split = s.split("");
            for (int j = 0; j < n; j++) {
                board[i][j] = split[j];
                redgreen[i][j] = split[j];
                if(split[j].equals("R")){
                    redgreen[i][j] = "G";
                }
            }
        }

        int a = separateBoard(board, n);
        int b = separateBoard(redgreen, n);
        bw.write(a + " " + b);
        bw.flush();

    }

    private static int separateBoard(String[][] board, int n) {
        int count = 1;
        int i = 0;
        int j = 0;
        while(i != n && j != n){

            //TODO BFS DFS 공부할 것
        }
        return count;
    }
}
