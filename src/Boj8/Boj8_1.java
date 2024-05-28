package Boj8;

import java.io.*;
import java.util.StringTokenizer;

public class Boj8_1 {
    public static void boj8_1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String[] split = s.split("");
        int n = Integer.parseInt(st.nextToken());
        int size = split.length;
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            sum += Character.getNumericValue(split[i].charAt(0)) * ( Math.pow(n, --size));
        }
        System.out.println(sum);

        bw.flush();
        bw.close();
        br.close();
    }
}
