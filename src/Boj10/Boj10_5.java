package Boj10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj10_5 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<Integer> xs = new ArrayList<>();
        List<Integer> ys = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xs.add(Integer.parseInt(st.nextToken()));
            ys.add(Integer.parseInt(st.nextToken()));
        }
        int xmax = xs.stream().max(Integer::compareTo).get();
        int xmin = xs.stream().min(Integer::compareTo).get();
        int ymax = ys.stream().max(Integer::compareTo).get();
        int ymin = ys.stream().min(Integer::compareTo).get();
        System.out.println((xmax - xmin) * (ymax - ymin));
    }
}
