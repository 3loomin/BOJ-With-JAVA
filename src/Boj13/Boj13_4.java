package Boj13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj13_4 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a  = Integer.parseInt(br.readLine());
            list.add(a);
        }

        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
    }
}
