package Boj10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj10_3 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> xs = new ArrayList<>();
        List<Integer> ys = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            xs.add(x);
            ys.add(y);
        }
        xs.stream().filter( i -> Collections.frequency(xs, i) == 1).forEach(i -> System.out.print(i));
        ys.stream().filter( i -> Collections.frequency(ys, i) == 1).forEach( i -> System.out.print(" " + i));
    }
}
