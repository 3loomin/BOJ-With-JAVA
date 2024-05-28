package Boj11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj11_7 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // f(n)
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // g(n)
        int c = Integer.parseInt(br.readLine());

        // n
        int x = Integer.parseInt(br.readLine());

        if ( ( (a * x + b) <= (c * x) ) && ( (a * (x + 50) + b) <= (c * (x + 50)) )  ) {
            System.out.println(1);
        } else System.out.println(0);
    }
}
