package Boj6;

import java.io.*;
import java.util.Arrays;
import java.util.OptionalInt;

public class Boj6_5 {

    public static void boj6_5() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().toLowerCase();
        String[] split = s.split("");
        int[] alphabet = new int[26];
        int check = 0;
        int checkidx = 0;

        for (int i = 0; i < split.length; i++) {
            alphabet[(int)split[i].charAt(0) - 'a']++;
        }
        // 알파벳별로 카운트
        // 카운트가 제일 높은 알파벳 찾기
        OptionalInt max = Arrays.stream(alphabet).max();
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == max.getAsInt()) {
                check++;
                checkidx = i;
            }
        }
        if(check == 1){
            System.out.println((char)('A' + checkidx));
        }
        else
            System.out.println("?");

        bw.flush();
        bw.close();
        br.close();
    }
}
