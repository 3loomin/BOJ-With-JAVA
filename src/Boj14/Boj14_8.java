package Boj14;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Boj14_8 {
    public static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    HashMap<String, Integer> map = new HashMap<>();

    String s = st.nextToken();

    // 한 자리 부터 s의 길이만큼
    for (int i = 1; i <= s.length(); i++) {
        for (int j = 0; j <= s.length() - i; j++) {
            String substring = s.substring(j, j + i);
            if(!map.containsKey(substring)) map.put(substring, 1);
        }
    }
    System.out.println(map.size());

    bw.flush();
}
}
