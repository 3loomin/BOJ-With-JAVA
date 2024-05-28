package Boj5;

import java.io.*;

public class Boj5_6 {

    public static void boj5_6() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] split = str.split("");
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < split.length; i++) {
            int n = (int)split[i].charAt(0) - 'a';
            if(alphabet[n] == -1 ) alphabet[n] = i;
        }

        for (int i = 0; i < alphabet.length; i++) {
            bw.write(alphabet[i] + " ");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
