package Boj8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj8_7 {
    public static void boj8_7() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble((st.nextToken()));
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        System.out.println((int)Math.ceil((c-b)/(a-b)));
    }
}
