package Boj14;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Boj14_2 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for (int q = 0; q < n; q++) {
            String s = br.readLine();
            map.put(s,0);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(map.containsKey(s)) count++;
        }
        System.out.println(count);
        bw.flush();
    }
}
