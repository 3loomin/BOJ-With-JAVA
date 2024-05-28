package Boj16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj16_1 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        int n = Integer.valueOf(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a  = Integer.parseInt(st.nextToken());
            switch (a){
                case 1  -> {
                    int b = Integer.parseInt(st.nextToken());
                    list.add(b);
                }
                case 2 -> {
                    bw.write(list.get(list.size() - 1) + "\n");
                    if(list.size() == 1) break;
                    else list.remove(list.size() - 1);
                }
                case 3 -> bw.write(list.size() -1 + "\n");
                case 4 -> {
                    if(list.size() == 1) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                }
                case 5 -> {
                    if(list.size() > 1) bw.write(list.get(list.size() -1 ) + "\n");
                    else bw.write(-1 + "\n");
                }

            }

        }

        bw.flush();
        bw.close();
    }
}
