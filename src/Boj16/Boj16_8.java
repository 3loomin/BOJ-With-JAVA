package Boj16;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Boj16_8 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i,0);
        }
        int i = 1;
        int ptr = 1;
        int count = 0;
        while(count != n){
            if(i > k) i = 1;
            if(ptr > n) ptr = 1;
            if(i == k){
                if(map.get(ptr) == 0) {
                    map.put(ptr,1);
                    answer.add(ptr);
                    count++;
                    i++;
                }
            }
            if(map.get(ptr) == 1){
                ptr++;
            } else {
                ptr++;
                i++;
            }
        }
        bw.write("<");
        for (int j = 0; j <= answer.size() - 2; j++) {
            bw.write(answer.get(j)+", ");
        }
        bw.write(answer.get(answer.size() -1)+ ">");

        bw.flush();
        bw.close();
    }
}
