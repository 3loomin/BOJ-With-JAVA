package Boj13;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Boj13_6 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String[] split = s.split("");

        Arrays.sort(split, Comparator.reverseOrder());
        for (int i = 0; i < split.length; i++) {
            bw.write(split[i]);
        }
        bw.flush();

    }
}
