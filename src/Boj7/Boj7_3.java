package Boj7;

import java.io.*;
import java.util.Arrays;

public class Boj7_3 {
    public static void boj7_3() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = new String[5];
        String[][] answer = new String[5][15];
        // init
        for (int i = 0; i < 5; i++) {
            Arrays.fill(answer[i]," ");
            s[i]=br.readLine();
        }
        // 문자저장
        for (int i = 0; i < 5; i++) {
            String[] split = s[i].split("");
            for (int j = 0; j < split.length; j++) {
                answer[i][j]=split[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(!answer[j][i].equals(" ")) bw.write(answer[j][i]);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
