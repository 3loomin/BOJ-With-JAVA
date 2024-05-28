package Boj13;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Boj13_8 {
    public static void solution() throws IOException {

        class Num {
            int x;
            int y;

            public int getX() {
                return x;
            }

            public int getY() {
                return y;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Num> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Num num = new Num();
            num.x = Integer.parseInt(st.nextToken());
            num.y = Integer.parseInt(st.nextToken());

            list.add(num);
        }

        list.sort(Comparator.comparingInt(Num::getY).thenComparing(Num::getX));
        for (Num num : list) {

            bw.write(num.getX() + " " + num.getY() + "\n");
        }

        bw.flush();

    }
}
