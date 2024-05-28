package Boj14;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Boj14_4 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> map = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();

        for (int q = 1; q <= n; q++) {
            String s = br.readLine();
            map.put(s , q);
            map2.put(q, s);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            // 숫자라면 map2에서 key로 사용
            if (Character.isDigit(s.charAt(0))) bw.write(map2.get(Integer.valueOf(s)) + "\n");
                // 문자로 시작한다면 map에서 key로 사용
            else bw.write((map.get(s)) + "\n");
        }
        bw.flush();
    }
}
