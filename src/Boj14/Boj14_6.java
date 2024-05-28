package Boj14;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Boj14_6 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            map.put(br.readLine() , 1);
        }
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }
        }

        List<String> answer = new ArrayList<>();
        for (String key : map.keySet()) {
            if(map.get(key) == 2) answer.add(key);
        }
        answer.sort(String::compareTo);
        bw.write(answer.size() + "\n");
        for (String key : answer) {
            bw.write(key + "\n");
        }

        bw.flush();
    }
}
