package Boj13;

import java.io.*;
import java.util.*;

public class Boj13_11 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int i1 = Integer.parseInt(st.nextToken());
            list.add(i1);
            arr[i] = i1;
        }
        Collections.sort(list);
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if(!map.containsKey(list.get(i))){
                map.put(list.get(i), idx++);
            }
        }
        for (int i = 0; i < n; i++) {
            bw.write(map.get(arr[i]) + " " );
        }
        bw.flush();
    }
}
