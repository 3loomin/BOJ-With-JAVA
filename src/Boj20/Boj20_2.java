package Boj20;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Boj20_2 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        TreeMap<String,Integer> tree = new TreeMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.equals("ENTER")){
                tree = new TreeMap<>();
            }
            else if(!tree.containsKey(s)){
                count++;
                tree.put(s,1);
            }

        }

        bw.write(count+ "");
        bw.flush();
        bw.close();
    }
}
