package Boj20;

import java.io.*;
import java.util.*;

public class Boj20_5 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() < m) continue;
            list.add(s);
            if(!map.containsKey(s)) map.put(s,1);
            else map.put(s, map.get(s) + 1);
        }

        List<String> keyset = new ArrayList<>(map.keySet());
        keyset.sort(Comparator.reverseOrder());
        keyset.sort(Comparator.comparing(String::length));
        keyset.sort(Comparator.comparing(map::get));


        for (int i = keyset.size() - 1;  i >= 0 ; i--) {
            bw.write(keyset.get(i) + "\n");
        }


        bw.flush();
        bw.close();
    }
}
