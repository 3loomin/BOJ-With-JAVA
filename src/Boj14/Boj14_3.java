package Boj14;

import java.io.*;
import java.util.*;

public class Boj14_3 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> map = new HashMap<>();
        for (int q = 0; q < n; q++) {
            String s = br.readLine();
            String[] split = s.split(" ");
            if(split[1].equals("enter")) map.put(split[0] , 0);
            else if(split[1].equals("leave"))map.remove(split[0]);
        }

        List<String> keyset = new ArrayList<>(map.keySet());
        keyset.sort(Comparator.reverseOrder());
        for (String worker : keyset) {
            bw.write(worker + "\n");
        }
        bw.flush();
    }
}
