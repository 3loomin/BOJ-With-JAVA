package Boj13;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Boj13_5 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            int a  = Integer.parseInt(br.readLine());
            list[i] = a;
        }
        br.close();

        IntStream sorted = Arrays.stream(list).sorted();

        for (int i : sorted.toArray()) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();

    }
}
