package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_2667 {
    static int[][] map;
    static boolean[][] check;
    static int n;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static List<Integer> list;
    static int cnt;

    //Main Class

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        check = new boolean[n][n];
        list = new ArrayList<>();
        cnt = 1;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 1 && !check[i][j]){
                    dfs(i,j);
                    list.add(cnt);
                    cnt = 1;
                }
            }
        }
        bw.write(list.size()+"\n");
        list.sort(Integer::compareTo);
        for (int a : list) bw.write(a + "\n");
        bw.flush();
        bw.close();
    }

    private static void dfs(int x, int y) {
        check[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nowX = x + dx[i];
            int nowY = y + dy[i];

            if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < n && map[nowX][nowY] == 1 && !check[nowX][nowY] ) {
                cnt++;
                dfs(nowX, nowY);
            }
        }
    }

}
