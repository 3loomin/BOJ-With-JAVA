package Boj15;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj15_3 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        //if(y1 == y2) bw.write((x2+x1) + " " + y1);
        //else{
        long ay = y1 * y2;
        long ax = ay / y1 * x1 + ay / y2 * x2;

        long ey = ay;
        long ex = ax;

        HashMap<Integer, Integer> ymap = new HashMap<>();
        HashMap<Integer, Integer> xmap = new HashMap<>();
        int mit = 2;
        // a 소인수 분해
        while (ay != 1 && ay > 1) {

            int jisu = 1;
            if (ay % mit == 0) {
                if (!ymap.containsKey(mit)) {
                    ymap.put(mit, jisu++);
                    ay /= mit;
                } else if (ymap.containsKey(mit)) {
                    ymap.put(mit, ymap.get(mit) + 1);
                    ay /= mit;
                }
            } else mit++;
        }

        mit = 2;
        // a 소인수 분해
        while (ax != 1 && ax > 1) {
            int jisu = 1;
            if (ax % mit == 0) {
                if (!xmap.containsKey(mit)) {
                    xmap.put(mit, jisu++);
                    ax /= mit;
                } else if (xmap.containsKey(mit)) {
                    xmap.put(mit, xmap.get(mit) + 1);
                    ax /= mit;
                }
            } else mit++;
        }
        HashMap<Integer, Integer> emap = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : ymap.entrySet()) {
            if (xmap.containsKey(entry.getKey())) {
                emap.put(entry.getKey(), Math.min(xmap.get(entry.getKey()), ymap.get(entry.getKey())));
            }
        }
        long sum = 1;
        for (Map.Entry<Integer, Integer> entry : emap.entrySet()) {
            sum *= Math.pow(entry.getKey(), entry.getValue());
        }

        bw.write((ex / sum) + " " + (ey / sum));
        //}

        bw.flush();
    }
}
