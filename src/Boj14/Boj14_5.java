package Boj14;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Boj14_5 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(map.containsKey(a)) map.put(a, map.get(a) + 1);
            else map.put(a, 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(map.get(a) == null) bw.write("0 ");
            else bw.write(map.get(a)+ " ");
        }
        bw.flush();
    }
}
