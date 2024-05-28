package Boj12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj12_4 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        //board 입력 받기
        int[][] board = new int[m][n];
        for (int i = 0; i <m; i++) {
            String s = br.readLine();
            String[] split = s.split("");
            for (int j = 0; j < n; j++) {
                board[i][j] = split[j].equals("W") ? 1 : 0;
            }
        }
        // 비교할 정답 두가지 만들어 놓기 - black(0)
        int[][] banswer = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0) banswer[i][j] = 0;
                else if (i % 2 == 0 && j % 2 == 1) banswer[i][j] = 1;
                else if (i % 2 == 1 && j % 2 == 0) banswer[i][j] = 1;
                else banswer[i][j] = 0;
            }
        }
        // 비교할 정답 두가지 만들어 놓기 - white(1)
        int[][] wanswer = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 == 0) wanswer[i][j] = 1;
                else if (i % 2 == 0 && j % 2 == 1) wanswer[i][j] = 0;
                else if (i % 2 == 1 && j % 2 == 0) wanswer[i][j] = 0;
                else wanswer[i][j] = 1;
            }
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < m - 7; i++) {
            for (int j = 0; j < n - 7 ; j++) {
                // i, j 가 좌상단 끝점 (피벗 지정)
                int[][] tmp;
                // 피벗 기준으로 정답판 가져오기
                // 정답판 두가지 경우 확인
                for (int s = 0; s < 2; s++) {
                    if (s == 0) tmp = banswer;
                    else tmp = wanswer;
                    int count = 0;
                    // 순회 하며 불량품 찾기
                    for (int k = i, a = 0; k < i + 8; k++, a++) {
                        for (int l = j, b = 0; l < j + 8; l++, b++) {
                            if (board[k][l] != tmp[a][b]) count++;
                        }
                    }
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);
        //board 출력용
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }
        System.out.println(answer.get(0));
    }
}
